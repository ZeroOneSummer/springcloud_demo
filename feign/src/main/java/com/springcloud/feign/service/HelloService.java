package com.springcloud.feign.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Administrator
 * @Description: TODO
 * @date 2018/10/30 18:40
 */
@FeignClient(value = "service-client")
public interface HelloService {

    @RequestMapping(value = "/port")
    String show();

}
