const base = {
    get() {
        return {
            url : "http://localhost:8080/qiyezaixianpeixun/",
            name: "qiyezaixianpeixun",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/qiyezaixianpeixun/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "企业在线培训系统"
        } 
    }
}
export default base
