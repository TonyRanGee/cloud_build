package com.qzr.qzr_service.comtroller;

import com.qzr.qzr_service.entity.Dept;
import com.qzr.qzr_service.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@RestController
@RequestMapping("/cloud")
public class TestController {

    @Autowired
    private  DeptService deptService;

    public Map<String,Object>  getJsonMap(boolean success,String message,Object entity){
        Map<String,Object> json = new HashMap<>();
        json.put("success",success);
        json.put("messzge",message);
        json.put("entity",entity);
        return json;
    }

    @RequestMapping("/data")
    public Map<String,Object> select(){
        Map json = this.getJsonMap(false,"系统繁忙",null);
        String name = "蒋介石";
        String sex = "男";
        Map<String,Object> map = new ConcurrentHashMap<>();
        map.put("name",name);
        map.put("sex",sex);
        if(map!=null){
            System.out.println("查询成功！");
            return this.getJsonMap(true,"查询成功",map);
        }
        return json;
    }

    @RequestMapping("/list")
    public Map<String,Object> deptList(){
        Map json = this.getJsonMap(false,"系统繁忙",null);
        Map<String,Object> map = new HashMap<>();
        List<Dept> list = deptService.deptList();
        map.put("list",list);
        if(list!=null){
            System.out.println("查询成功!");
            return this.getJsonMap(true,"查询成功",list);
        }
        return json;
    }
}
