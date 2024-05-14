package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@Controller
public class MyController {
    /**
     * 1.@Controller作用
     * 在类上加上@Controller注解 标记该类是springmvc控制类
     * 2.@RequestMapping
     * 定义url映射
     * 3.@ResponseBody
     * 该接口返回json数据
     */
//    @RequestMapping("/getMap")
//    @ResponseBody
//    public Map<String, Object> getMap(){
//        HashMap<String, Object> result = new HashMap<>();
//        result.put("code","200");
//        result.put("msg","ok");
//        //访问该接口 返回json数据
//        return result;
//    }

    @RequestMapping("/getMap")
    @ResponseBody
    public String getMap(){
        return "{code:'200',msg:'ok'}";
    }
}
