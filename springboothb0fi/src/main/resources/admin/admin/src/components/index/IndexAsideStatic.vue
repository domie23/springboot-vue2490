<template>
	<div class="menu-preview">
		<!-- 竖向 -->
		<el-scrollbar wrap-class="scrollbar-wrapper">
			<el-menu :default-openeds="[]" :unique-opened="true" :style='{"border":0,"padding":"0","listStyle":"none","margin":"0","position":"relative","background":"#FFF"}' class="el-menu-vertical-demo" default-active="0">
				<el-image v-if="false" :style='{"width":"44px","margin":"10px auto","objectFit":"cover","borderRadius":"100%","display":"block","height":"44px"}' src="http://codegen.caihongy.cn/20201114/7856ba26477849ea828f481fa2773a95.jpg" fit="cover"></el-image>
				<!-- <el-menu-item index="0" @click="menuHandler('')">
					<i v-if='true' :style='{"width":"34px","verticalAlign":"middle","margin":"0 3px","fontSize":"18px","color":"inherit","textAlign":"center"}' class="el-icon-menu el-icon-s-home" />
					<span :style='{"color":"inherit","verticalAlign":"middle","fontSize":"14px"}'>系统首页</span>
				</el-menu-item> -->
				
				<el-submenu index="0" @click.native="menuHandler('')">
					<template slot="title">
						<i v-if='true' :style='{"width":"34px","verticalAlign":"middle","margin":"0 3px","fontSize":"18px","color":"inherit","textAlign":"center"}' class="el-icon-menu el-icon-s-home" />
						<span :style='{"color":"inherit","verticalAlign":"middle","fontSize":"14px"}'>系统首页</span>
					</template>
				</el-submenu>
				
				<el-submenu index="1">
					<template slot="title">
						<i v-if='true' :style='{"width":"34px","verticalAlign":"middle","margin":"0 3px","fontSize":"18px","color":"inherit","textAlign":"center"}' class="el-icon-menu el-icon-user-solid" />
						<span :style='{"color":"inherit","verticalAlign":"middle","fontSize":"14px"}'>个人中心</span>
					</template>
					<el-menu-item index="1-1" @click="menuHandler('updatePassword')">修改密码</el-menu-item>
					<el-menu-item index="1-2" @click="menuHandler('center')">个人信息</el-menu-item>
				</el-submenu>
				<el-submenu v-for=" (menu,index) in menuList.backMenu" :key="menu.menu" :index="index+2+''">
					<template slot="title">
						<i v-if='true' :style='{"width":"34px","verticalAlign":"middle","margin":"0 3px","fontSize":"18px","color":"inherit","textAlign":"center"}' class="el-icon-menu" :class="icons[index]" />
						<span :style='{"color":"inherit","verticalAlign":"middle","fontSize":"14px"}'>{{ menu.menu }}</span>
					</template>
					<el-menu-item v-for=" (child,sort) in menu.child" :key="sort" :index="(index+2)+'-'+sort" @click="menuHandler(child.tableName)">{{ child.menu }}</el-menu-item>
				</el-submenu>
			</el-menu>
		</el-scrollbar>

	</div>
</template>

<script>
import menu from '@/utils/menu'
export default {
	data() {
		return {
			menuList: [],
			dynamicMenuRoutes: [],
			role: '',
			icons: [
				'el-icon-s-cooperation',
				'el-icon-s-order',
				'el-icon-s-platform',
				'el-icon-s-fold',
				'el-icon-s-unfold',
				'el-icon-s-operation',
				'el-icon-s-promotion',
				'el-icon-s-release',
				'el-icon-s-ticket',
				'el-icon-s-management',
				'el-icon-s-open',
				'el-icon-s-shop',
				'el-icon-s-marketing',
				'el-icon-s-flag',
				'el-icon-s-comment',
				'el-icon-s-finance',
				'el-icon-s-claim',
				'el-icon-s-custom',
				'el-icon-s-opportunity',
				'el-icon-s-data',
				'el-icon-s-check',
				'el-icon-s-grid',
				'el-icon-menu',
				'el-icon-chat-dot-square',
				'el-icon-message',
				'el-icon-postcard',
				'el-icon-position',
				'el-icon-microphone',
				'el-icon-close-notification',
				'el-icon-bangzhu',
				'el-icon-time',
				'el-icon-odometer',
				'el-icon-crop',
				'el-icon-aim',
				'el-icon-switch-button',
				'el-icon-full-screen',
				'el-icon-copy-document',
				'el-icon-mic',
				'el-icon-stopwatch',
			],
			menulistBorderBottom: {},
		}
	},
	mounted() {
		const menus = menu.list()
		if(menus) {
			this.menuList = menus
		} else {
			let params = {
				page: 1,
				limit: 1,
				sort: 'id',
			}
			
			this.$http({
				url: "menu/list",
				method: "get",
				params: params
			}).then(({
				data
			}) => {
				if (data && data.code === 0) {
					this.menuList = JSON.parse(data.data.list[0].menujson);
					this.$storage.set("menus", this.menuList);
				}
			})
		}
		this.role = this.$storage.get('role')
		
		for(let i=0;i<this.menuList.length;i++) {
			if(this.menuList[i].roleName == this.role) {
				this.menuList = this.menuList[i];
				break;
			}
		}
		this.styleChange()
	},
	created(){
		this.icons.sort(()=>{
			return (0.5-Math.random())
		})
	},
	methods: {
		
		styleChange() {
			this.$nextTick(() => {
								document.querySelectorAll('.el-menu-vertical-demo .el-submenu .el-menu').forEach(el => {
				  el.removeAttribute('style')
				  const icon = {"border":"none","display":"none"}
				  Object.keys(icon).forEach((key) => {
					el.style[key] = icon[key]
				  })
				})
											})
		},
		menuHandler(name) {
			let router = this.$router
			name = '/'+name
			router.push(name)
		},
	}
}
</script>
<style lang="scss" scoped>
	.menu-preview {
	  .el-scrollbar {
	    height: 100%;
	
	    & /deep/ .scrollbar-wrapper {
	      overflow-x: hidden;
	    }
		
				// 竖向
		.el-menu-vertical-demo {
		  .el-submenu:first-of-type /deep/ .el-submenu__title .el-submenu__icon-arrow {
		    display: none;
		  }
		}
		
		.el-menu-vertical-demo>.el-menu-item {
				  				  cursor: pointer;
				  				  padding: 0 20px;
				  				  margin: 0 auto;
				  				  color: #999;
				  				  white-space: nowrap;
				  				  display: flex;
				  				  border-color: #DBDBDB;
				  				  border-radius: 60px;
				  				  background: linear-gradient(90deg, #E7E7E7 0%, #E7E7E7 44%, #EFF1F5 44%, #EFF1F5 100%);
				  				  width: 90%;
				  				  justify-content: space-around;
				  				  border-width: 0 0 0 6px;
				  				  align-items: center;
				  				  position: relative;
				  				  border-style: solid;
				  		}
		
		.el-menu-vertical-demo>.el-menu-item:hover {
						color: #000;
						background: linear-gradient(90deg, #BEC8D0 0%, #778388 44%, #EFF1F5 44%, #EFF1F5 100%);
						border-color: #778388;
						border-width: 0 0 0 6px;
						border-style: solid;
					}
		
		.el-menu-vertical-demo .el-submenu /deep/ .el-submenu__title {
						cursor: pointer;
						padding: 0 20px;
						margin: 0 auto;
						color: #999;
						white-space: nowrap;
						display: flex;
						border-color: #DBDBDB;
						border-radius: 60px;
						background: linear-gradient(90deg, #E7E7E7 0%, #E7E7E7 44%, #EFF1F5 44%, #EFF1F5 100%);
						width: 90%;
						justify-content: space-around;
						border-width: 0 0 0 6px;
						align-items: center;
						position: relative;
						border-style: solid;
					}
		
		.el-menu-vertical-demo .el-submenu /deep/ .el-submenu__title:hover {
						color: #000;
						background: linear-gradient(90deg, #BEC8D0 0%, #778388 44%, #EFF1F5 44%, #EFF1F5 100%);
						border-color: #778388;
						border-width: 0 0 0 6px;
						border-style: solid;
					}
		
		.el-menu-vertical-demo .el-submenu /deep/ .el-submenu__title .el-submenu__icon-arrow {
						margin: -7px 0 0 0;
						top: 50%;
						color: inherit;
						vertical-align: middle;
						font-size: 0;
						position: absolute;
						right: 20px;
					}
		
		.el-menu-vertical-demo .el-submenu {
						border-radius: 60px;
						padding: 4px 0;
						margin: 0 auto 10px;
						background: linear-gradient(180deg, #B9BFC4 0%, #D6E0E5 100%);
						width: 95%;
						list-style: none;
					}
		
		// .el-menu-vertical-demo .el-submenu /deep/ .el-menu {
		// 				// 		border: none;
		// 				// 		display: none;
		// 				// }
		
		.el-menu-vertical-demo .el-submenu /deep/ .el-menu .el-menu-item {
						padding: 0 40px;
						margin: 0 0 2px;
						color: #666;
						background: #EDEDED;
						line-height: 50px;
						text-align: center;
						height: 50px;
					}
		
		.el-menu-vertical-demo .el-submenu /deep/ .el-menu .el-menu-item:hover {
						padding: 0 40px;
						color: #fff;
						background: #778388;
						line-height: 50px;
						height: 50px;
					}
		
		.el-menu-vertical-demo .el-submenu /deep/ .el-menu .el-menu-item.is-active {
						padding: 0 40px;
						color: #fff;
						background: #778388;
						line-height: 50px;
						height: 50px;
					}
		// 竖向
			  }
	  	}
</style>
