package com.springcloud.ribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author jp
 * @Description: TODO
 * @date 2018/10/29 18:16
 */
@Service
public class HelloService {

    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "helloError")
    public String show() {
        return restTemplate.getForObject("http://service-client/port", String.class);
    }

    public String helloError() {
        return "this ribbon request is hystrixed,sorry,error!";
    }

}
