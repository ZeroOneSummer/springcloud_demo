package com.springcloud.eurekaclient;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
@Slf4j
public class EurekaClientApplication implements ApplicationListener {
    Logger logger = LoggerFactory.getLogger(getClass());

    public static void main(String[] args) {
        SpringApplication.run(EurekaClientApplication.class, args);
    }

    @Override
    public void onApplicationEvent(ApplicationEvent applicationEvent) {
        logger.info("the application is started ...");
    }

    @Value("${server.port:8762}")
    String port;

    @RequestMapping(value = "/port", method = RequestMethod.GET)
    public String show(){
        String msg = "the server port is " + port;
        logger.info(msg);
        return msg;
    }
}
