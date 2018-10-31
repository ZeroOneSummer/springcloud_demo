package com.springcloud.feign.service;

import com.springcloud.feign.service.impl.HelloServiceImpl;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author jp
 * @Description: TODO
 * @date 2018/10/30 18:40
 */
@FeignClient(value = "service-client", fallback = HelloServiceImpl.class)
public interface HelloService {

    @RequestMapping(value = "/port")
    String show();

}
