package com.qzr.qzr_consumer.service.impl;

import com.qzr.qzr_consumer.service.ConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@Component
public class ConsumerHystrix implements ConsumerService {
    @Override
    public String hello(@RequestParam(value = "name") String name) {
        return "Hello！"+name+"is send failed" ;
    }
    @Autowired
    RestTemplate restTemplate;

    @Override
    public Map<String, Object> select() {
        Map map = new HashMap();
        String message="服务异常！";
        Object entity=null;
        map.put("result",false);
        map.put("message",message);
        map.put("entity",entity);
        return map;
    }

    @Override
    public Map<String, Object> deptList() {
        Map map = new HashMap();
        boolean result;
        String message="服务无法进行调用！";
        Object entity=null;
        map.put("result",false);
        map.put("message",message);
        map.put("entity",entity);
        return map;
    }
}
