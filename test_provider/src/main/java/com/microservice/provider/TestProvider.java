package com.microservice.provider;

import org.apache.servicecomb.provider.rest.common.RestSchema;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RestSchema(schemaId = "test")
@RequestMapping(path = "/provider/v1")
public class TestProvider {

    @RequestMapping(path = "/str/{name}",method = RequestMethod.GET)
    public String hello(@PathVariable("name")String name){
        return name;
    }
}