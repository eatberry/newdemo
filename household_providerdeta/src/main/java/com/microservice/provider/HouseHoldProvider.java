package com.microservice.provider;

import com.microservice.model.HouseHold;
import com.microservice.model.Result;
import org.apache.servicecomb.provider.rest.common.RestSchema;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

//生产者
@RestSchema(schemaId = "household")
@RequestMapping(path = "/provider/v1")
public class HouseHoldProvider {
    private HouseHold houseHold1 = new HouseHold("无霜冷藏冰箱", 2500.00, "海尔", "箱门结构: 三门式, 制冷方式: 风冷, 能效等级: 一级, 服务: 并且本店节假日同城开启配送服务，只要活动期间付款成功，均可享受免费配送服务");
    private HouseHold houseHold2 = new HouseHold("变频空调", 3000.00, "格力", "空调类型: 壁挂式, 最大功率: 大1.5匹, 冷暖类型: 冷暖型");
    private HouseHold houseHold3 = new HouseHold("洗衣机", 1799.99, "合肥美的", "产品类型: 滚筒洗衣机, 使用方式: 全自动, 洗衣程序: 单脱水, 羽绒服, 混合羊毛, 其他");
    /****
     * 无配送业务
     * @param name
     * @return
     */
    @RequestMapping(path = "/sell/{name}",method = RequestMethod.GET)
    public Result sell(@PathVariable("name")String name){
        List<HouseHold> list = new ArrayList<HouseHold>();

        if (name.equals("bingxiang")){
            list.add(houseHold1);
            return new Result(list);
        }else if (name.equals("空调")){
            list.add(houseHold2);
            return new Result(list);
        }else if (name.equals("洗衣机")){
            list.add(houseHold3);
            return new Result(list);
        }else if (name.equals("")){
            list.add(houseHold1);
            list.add(houseHold2);
            list.add(houseHold3);
            return new Result(list);
        }else{
            return new Result("本店只销售冰箱、空调、洗衣机, 其余商品暂无上架, 敬请期待 ......");
        }
    }



    /****
     * 所有商品
     * @return
     */
    @RequestMapping(path = "/list",method = RequestMethod.GET)
    public List<HouseHold> list(){
        List<HouseHold> houseHolds = new ArrayList<HouseHold>();
        houseHolds.add(houseHold1);
        houseHolds.add(houseHold2);
        houseHolds.add(houseHold3);
        return houseHolds;
    }

    /****
     * 额外的配送服务接口
     * @return
     */
    @RequestMapping(path = "/trans",method = RequestMethod.GET)
    public Result transport(){

        Result result = new Result();
        result.setMsg("本店节假日同城开启配送服务，只要活动期间付款成功，均可享受免费配送服务");
        result.setUrl("image/transport.jpg");
        return result;
    }






}
