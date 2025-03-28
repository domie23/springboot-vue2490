import VueRouter from 'vue-router'

//引入组件
import Index from '../pages'
import Home from '../pages/home/home'
import Login from '../pages/login/login'
import Register from '../pages/register/register'
import Center from '../pages/center/center'
import News from '../pages/news/news-list'
import NewsDetail from '../pages/news/news-detail'
import yonghuList from '../pages/yonghu/list'
import yonghuDetail from '../pages/yonghu/detail'
import yonghuAdd from '../pages/yonghu/add'
import diandongchexinxiList from '../pages/diandongchexinxi/list'
import diandongchexinxiDetail from '../pages/diandongchexinxi/detail'
import diandongchexinxiAdd from '../pages/diandongchexinxi/add'
import diandongchezulinList from '../pages/diandongchezulin/list'
import diandongchezulinDetail from '../pages/diandongchezulin/detail'
import diandongchezulinAdd from '../pages/diandongchezulin/add'
import dingdanxinxiList from '../pages/dingdanxinxi/list'
import dingdanxinxiDetail from '../pages/dingdanxinxi/detail'
import dingdanxinxiAdd from '../pages/dingdanxinxi/add'
import diandongchebaoxiuList from '../pages/diandongchebaoxiu/list'
import diandongchebaoxiuDetail from '../pages/diandongchebaoxiu/detail'
import diandongchebaoxiuAdd from '../pages/diandongchebaoxiu/add'

const originalPush = VueRouter.prototype.push
VueRouter.prototype.push = function push(location) {
	return originalPush.call(this, location).catch(err => err)
}

//配置路由
export default new VueRouter({
	routes:[
		{
      path: '/',
      redirect: '/index/home'
    },
		{
			path: '/index',
			component: Index,
			children:[
				{
					path: 'home',
					component: Home
				},
				{
					path: 'center',
					component: Center,
				},
				{
					path: 'news',
					component: News
				},
				{
					path: 'newsDetail',
					component: NewsDetail
				},
				{
					path: 'yonghu',
					component: yonghuList
				},
				{
					path: 'yonghuDetail',
					component: yonghuDetail
				},
				{
					path: 'yonghuAdd',
					component: yonghuAdd
				},
				{
					path: 'diandongchexinxi',
					component: diandongchexinxiList
				},
				{
					path: 'diandongchexinxiDetail',
					component: diandongchexinxiDetail
				},
				{
					path: 'diandongchexinxiAdd',
					component: diandongchexinxiAdd
				},
				{
					path: 'diandongchezulin',
					component: diandongchezulinList
				},
				{
					path: 'diandongchezulinDetail',
					component: diandongchezulinDetail
				},
				{
					path: 'diandongchezulinAdd',
					component: diandongchezulinAdd
				},
				{
					path: 'dingdanxinxi',
					component: dingdanxinxiList
				},
				{
					path: 'dingdanxinxiDetail',
					component: dingdanxinxiDetail
				},
				{
					path: 'dingdanxinxiAdd',
					component: dingdanxinxiAdd
				},
				{
					path: 'diandongchebaoxiu',
					component: diandongchebaoxiuList
				},
				{
					path: 'diandongchebaoxiuDetail',
					component: diandongchebaoxiuDetail
				},
				{
					path: 'diandongchebaoxiuAdd',
					component: diandongchebaoxiuAdd
				},
			]
		},
		{
			path: '/login',
			component: Login
		},
		{
			path: '/register',
			component: Register
		},
	]
})
