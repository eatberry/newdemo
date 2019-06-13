var app = new Vue({
    el:'#app',
    data:{
        dataName1:"",
        dataName2:"",
        dataList1:[],
        dataList2:{},
        dataList3:{}
    },
    methods:{
        searchList1:function(){
            axios.get('http://49.4.70.143:30001/provider/v0/list').then(function(response1){
                app.dataList1 = response1.data
            })
        },

        searchList2:function(){
            axios.get('/consumer/v0/listex').then(function(response2){
                app.dataList2 = response2.data
            })
        },

        searchList3:function(){
            axios.get('/consumer/v0/plist').then(function(response3){
                app.dataList3 = response3.data
            })
        },

        searchList4:function(){
            axios.get('/consumer/v0/trans').then(function(response4){
                app.dataList4 = response4.data
            })
        },



        search1:function(name){
            axios.get('/consumer/v0/sell?name='+name).then(function(response5){
                app.dataName1 = response3.data
            })
        },

        search2:function(name){
            axios.get('/consumer/v0/sellex?name='+name).then(function(response6){
                app.dataName2 = response6.data
            })
        },
    },
    created:function(){
        searchList1()
        searchList2()
        searchList3()
        searchList4()

        search1()
        search2()

    }

})