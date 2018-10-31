package com.springcloud.eurekaclient.service;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jp
 * @Description: TODO
 * @date 2018/10/30 18:43
 */
@RestController
@Slf4j
public class HelloService {
    Logger logger = LoggerFactory.getLogger(getClass());

    @Value("${server.port:8762}")
    String port;

    @RequestMapping(value = "/port", method = RequestMethod.GET)
    public String show(){
        String msg = "the server port is " + port;
        logger.info(msg);
        return msg;
    }

}
