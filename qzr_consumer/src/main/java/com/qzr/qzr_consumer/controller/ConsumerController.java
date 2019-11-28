package com.qzr.qzr_consumer.controller;

import com.qzr.qzr_consumer.service.ConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/cloud")
public class ConsumerController {
    @Autowired
    private ConsumerService consumerService;

    @RequestMapping("hello/{name}")
    public String hello(@PathVariable(value = "name" ,required = false) String name){
        return consumerService.hello(name);
    }

    @RequestMapping("/data")
    public Map<String,Object> select(){
        return consumerService.select();
    }

    @RequestMapping("/list")
    public Map<String,Object> deptList(){
        return consumerService.deptList();
    }

}
