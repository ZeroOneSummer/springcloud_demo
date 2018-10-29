package com.springcloud.ribbon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author Administrator
 * @Description: TODO
 * @date 2018/10/29 18:16
 */
@Service
public class HelloService {

    @Autowired
    RestTemplate restTemplate;

    public String show() {
        return restTemplate.getForObject("http://service-show/port", String.class);
    }

}
