package com.blz.restapi;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestapiApplication {

    public static final Logger loger = LoggerFactory.getLogger(RestapiApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(RestapiApplication.class, args);
        loger.info("info");

    }

}
