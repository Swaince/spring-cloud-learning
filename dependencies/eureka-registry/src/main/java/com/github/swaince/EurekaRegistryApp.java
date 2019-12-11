package com.github.swaince;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author zhanth
 * @date 2019/12/10 15:23
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaRegistryApp {

    public static void main(String[] args) {
        SpringApplication.run(EurekaRegistryApp.class, args);
    }
}
