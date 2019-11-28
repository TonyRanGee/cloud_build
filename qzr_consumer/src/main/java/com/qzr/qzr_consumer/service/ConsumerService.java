package com.qzr.qzr_consumer.service;
import com.qzr.qzr_consumer.service.impl.ConsumerHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@FeignClient(name = "qzr-service",fallback = ConsumerHystrix.class)
public interface ConsumerService {
    @RequestMapping(value = "cloud/hello")
    public String hello(@RequestParam(value = "name") String name);

    @RequestMapping(value = "cloud/data")
    public Map<String, Object> select();

    @RequestMapping(value = "cloud/list")
    public Map<String, Object> deptList();
}
