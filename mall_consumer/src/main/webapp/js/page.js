var app = new Vue({
    el: "#app",
    data:{
        entity:{},
        dataList:[]
    },
    methods:{
        searchEntity:function (name) {
            axios.get("/consumer/v0/sell?"+name).then(function (response) {
                app.entity = response.data
            })
        },

        searchList: function (){
            axios.get("/consumer/v0/list").then(function(response){
                app.dataList = response.data
            })
        }
    },
    created:function () {
        this.searchEntity("冰箱");

        this.searchList();
    }
}) 