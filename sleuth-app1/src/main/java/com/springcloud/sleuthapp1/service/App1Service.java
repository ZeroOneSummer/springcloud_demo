package com.springcloud.sleuthapp1.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author jp
 * @Description: TODO
 * @date 2018/11/1 11:37
 */
@RestController
public class App1Service {
    private static final Logger logger = LoggerFactory.getLogger(App1Service.class);

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/app")
    public String callHome(){
        logger.info(">>> into service-app1:/app access service-app2:/app");
        return restTemplate.getForObject("http://localhost:9763/app", String.class);
    }

    @RequestMapping("/info")
    public String info(){
        logger.info(">>> into service-app1:/info");
        return "i'm service-app1:/info!";

    }

}
