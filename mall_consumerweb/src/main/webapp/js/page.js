var app = new Vue({
    el:'#app',
    data:{
        goods:'商品',
        dataList:[]
    },
    methods:{
        searchList:function(){
            axios.get('/consumer/v0/plist').then(function(response){
                app.dataList = response.data
            })
        }
    },
    created:function(){
        searchList()

    }

})