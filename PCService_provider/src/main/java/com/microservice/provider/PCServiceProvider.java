package com.microservice.provider;

import com.microservice.model.PCService;
import org.apache.servicecomb.provider.rest.common.RestSchema;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

@RestSchema(schemaId = "pcservice")
@RequestMapping(path = "/pcprovider/v0")
public class PCServiceProvider {

    private PCService pcService1 = new PCService("超薄游戏本", 6500.00, "华为", "型号: MACHR-W19, CPU: 第八代智能英特尔 酷睿 i5-826U");
    private PCService pcService2 = new PCService("MSI/微星吃鸡主机", 4500.99, "微星MSI", "散热方式: 风冷, 硬盘类型: 固态硬盘(SSD), 光驱类型: 无光驱");
    private PCService pcService3 = new PCService("机械键盘/鼠标", 556.99, "罗技", "连接方式: 线连接, 售后服务: 全国联保, 是否有多媒体功能键: 有, 是否为机械键盘: 是");

    /****
     * PC业务
     * @param name
     * @return
     */
    @RequestMapping(path = "/sell/{name}",method = RequestMethod.GET)
    public PCService sell(@PathVariable("name")String name){
        if (name.equals("笔记本")){
            return pcService1;
        }else if (name.equals("主机")){
            return pcService2;
        }else if (name.equals("外设")){
            return pcService3;
        }else{
            return new PCService("目前PC业务上线商品较少, 敬请期待 ...");
        }
    }
    //pc集合
    @RequestMapping(path = "/list",method = RequestMethod.GET)
    public List<PCService> list(){
        List<PCService> pcServiceList = new ArrayList<PCService>();
        pcServiceList.add(pcService1);
        pcServiceList.add(pcService2);
        pcServiceList.add(pcService3);
        return pcServiceList;
    }
}
