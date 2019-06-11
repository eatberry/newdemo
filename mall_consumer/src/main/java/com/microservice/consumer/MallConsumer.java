package com.microservice.consumer;

import com.microservice.model.HouseHold;
import com.microservice.model.PCService;
import com.microservice.model.Result;
import com.microservice.service.HouseHoldProvider;
import com.microservice.service.HouseHoldProviderDeta;
import com.microservice.service.PCServiceProvider;
import org.apache.servicecomb.provider.pojo.RpcReference;
import org.apache.servicecomb.provider.rest.common.RestSchema;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import java.util.List;

//消费者
@RestSchema(schemaId = "consumer")
@Path("/consumer/v0")
public class MallConsumer {

    //rpc远程注入HouseHoldProvider
    @RpcReference(microserviceName = "householdprovider",schemaId = "household")
    private HouseHoldProvider houseHoldProvider;

    //rpc远程注入HouseHoldProviderDeta
    @RpcReference(microserviceName = "householdprovider",schemaId = "household")
    private HouseHoldProviderDeta houseHoldProviderDeta;

    //rpc远程注入PCServiceProvider
    @RpcReference(microserviceName = "pcserviceprovider",schemaId = "pcservice")
    private PCServiceProvider pcServiceProvider;

    //==============================v0==================================
    /****
     * 无配送业务家电
     * @param name
     * @return
     */
    @Path("/sell")
    @GET
    public Result sellElec(@QueryParam("name")String name)throws Exception{
        return houseHoldProvider.sell(name);
    }
    /****
     * 查看所有
     * @return
     */
    @Path("/list")
    @GET
    public List<HouseHold> list(){
        return houseHoldProvider.list();
    }

    //===============================v1=================================
    /****
     * 有配送业务家电
     * @param name
     * @return
     */
    @Path("/sellex")
    @GET
    public Result sellElecEx(@QueryParam("name")String name){
        return houseHoldProviderDeta.sell(name);
    }
    /****
     * 查看所有
     * @return
     */
    @Path("/listex")
    @GET
    public List<HouseHold> listex(){
        return houseHoldProviderDeta.list();
    }
    /****
     * 增添额外的配送业务接口
     * @return
     */
    @Path("/trans")
    @GET
    public Result transport(){
        return houseHoldProviderDeta.transport();
    }
    //================================v1==================================


    //================================pcservice v0==================================
    /****
     * PC业务
     * @param pname
     * @return
     */
    @Path("/sellpc")
    @GET
    public PCService sellPc(@QueryParam("pname")String pname){
        return pcServiceProvider.sell(pname);
    }
    //所有外设
    @Path("/plist")
    @GET
    public List<PCService> plist(){
        return pcServiceProvider.list();
    }
    //================================pcservice v0==================================
}
