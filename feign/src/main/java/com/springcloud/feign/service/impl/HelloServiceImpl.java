package com.springcloud.feign.service.impl;

import com.springcloud.feign.service.HelloService;
import org.springframework.stereotype.Component;

/**
 * @author jp
 * @Description: TODO
 * @date 2018/10/31 9:40
 */
@Component
public class HelloServiceImpl implements HelloService {

    @Override
    public String show() {
        return "this feign request is hystrixed,sorry,error!";
    }

}
