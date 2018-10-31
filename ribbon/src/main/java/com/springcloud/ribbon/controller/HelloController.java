package com.springcloud.ribbon.controller;

import com.springcloud.ribbon.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jp
 * @Description: TODO
 * @date 2018/10/29 18:19
 */
@RestController
public class HelloController {

    @Autowired
    HelloService helloService;

    @RequestMapping(value = "/port")
    public String show(){
        System.out.println("-------由ribbon发起请求");
        return helloService.show();
    }

}
