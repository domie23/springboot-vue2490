const base = {
    get() {
        return {
            url : "http://localhost:8080/springboothb0fi/",
            name: "springboothb0fi",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/springboothb0fi/front/dist/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "基于springboot的高校电动车租赁系统"
        } 
    }
}
export default base
