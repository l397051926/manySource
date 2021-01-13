package com.lmx.manysource.controller;

import com.lmx.manysource.service.SystemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: lmx
 * @create: 2021/1/12
 **/
@RestController
public class SystemController {

    @Autowired
    private SystemService systemService;

    @GetMapping("/hello")
    public String hello()
    {
        systemService.test();
        return "hello world";
    }


    @GetMapping("/mysql")
    public String mysql()
    {
        systemService.mysql();
        return "hello world";
    }


}
