<template>
<div class="content" :style='{"minHeight":"100vh","padding":"30px","textAlign":"center","background":"url(http://codegen.caihongy.cn/20230303/0a378aed3c5748ab969bb5d249fe2d4f.jpg) no-repeat center bottom / 100% 100%"}'>
	<div class="text" :style='{"padding":"4px 6px","margin":"50px auto","color":"rgb(51, 51, 51)","borderRadius":"8px","textAlign":"center","background":"#fff","display":"inline-block","width":"auto","fontSize":"24px","fontWeight":"bold"}'>欢迎使用 {{this.$project.projectName}}</div>
</div>
</template>
<script>
//0
import router from '@/router/router-static'
import * as echarts from 'echarts'
export default {
	data() {
		return {
		};
	},
  mounted(){
    this.init();
  },
  methods:{
    init(){
        if(this.$storage.get('Token')){
        this.$http({
            url: `${this.$storage.get('sessionTable')}/session`,
            method: "get"
        }).then(({ data }) => {
            if (data && data.code != 0) {
            router.push({ name: 'login' })
            }
        });
        }else{
            router.push({ name: 'login' })
        }
    },
  }
};
</script>
<style lang="scss" scoped>
    .cardView {
        display: flex;
        flex-wrap: wrap;
        width: 100%;

        .cards {
            display: flex;
            align-items: center;
            width: 100%;
            margin-bottom: 10px;
            justify-content: center;
            .card {
                width: calc(25% - 20px);
                margin: 0 10px;
                /deep/.el-card__body{
                    padding: 0;
                }
            }
        }
    }
</style>
