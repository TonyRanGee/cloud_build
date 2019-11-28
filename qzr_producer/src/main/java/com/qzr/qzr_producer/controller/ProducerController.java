package com.qzr.qzr_producer.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cloud")
public class ProducerController {

    @RequestMapping("/hello")
    public String index(@RequestParam("name") String name) {
        return "hello "+name+"，this is first message";
    }
}
