package com.springcloud.sleuthapp2.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author jp
 * @Description: TODO
 * @date 2018/11/1 11:48
 */
@RestController
public class App2Service {
    private static final Logger logger = LoggerFactory.getLogger(App2Service.class);

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/app")
    public String home(){
        logger.info(">>> into service-app2:/app");
        return "i'm service-app2:/app!";
    }

    @RequestMapping("/info")
    public String info(){
        logger.info(">>> into service-app2:/info access service-app1:/info");
        return restTemplate.getForObject("http://localhost:9762/info",String.class);
    }

}
