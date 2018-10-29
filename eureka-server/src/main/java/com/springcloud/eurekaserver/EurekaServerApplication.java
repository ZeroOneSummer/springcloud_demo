package com.springcloud.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication implements ApplicationListener {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApplication.class, args);
    }

    @Override
    public void onApplicationEvent(ApplicationEvent applicationEvent) {
        System.out.println("the application is started ...");
    }

}
