package com.harris.cashfig;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author panyanan
 * @create 2017-05-25 12:44
 */
@EnableEurekaClient
@SpringBootApplication
public class AppBootstrap {
    public static void main(String[] args) {
        new SpringApplicationBuilder(AppBootstrap.class).web(true).run(args);
    }
}
