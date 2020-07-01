package com.harris.cashfig;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@EnableEurekaClient
@SpringBootApplication
@EnableConfigServer
public class ServerBootstrap {
    public static void main(String[] args) {
        new SpringApplicationBuilder(ServerBootstrap.class).web(true).run(args);
    }
}
