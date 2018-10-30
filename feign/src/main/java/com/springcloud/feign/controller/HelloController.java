package com.springcloud.feign.controller;

import com.springcloud.feign.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Administrator
 * @Description: TODO
 * @date 2018/10/30 18:45
 */
@RestController
public class HelloController {

    @Autowired
    HelloService helloService;

    @RequestMapping(value = "/port")
    public String show(){
        return helloService.show();
    }

}
