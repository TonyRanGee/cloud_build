package com.qzr.rabbit_server;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RabbitController {

    @Autowired
    Producer producer;

    @GetMapping("/hello")
    public String hello(){
        producer.send();
        return "success";
    }
}
