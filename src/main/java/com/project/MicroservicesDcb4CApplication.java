package com.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@SpringBootApplication
@EnableEurekaClient
@EnableHystrix
public class MicroservicesDcb4CApplication {

    // Differences from B version (before hystrix+dashboard implementation):
    // @EnableHystrix annotation added to main class.
    // Fallback methods added.
    // filter section added to application.yml file (for fallback redirection).
    // hystrix section added to application.yml file. (to decide how long to wait before fallback is called)
    // management section added to application.yml file. (apparently adds information to hystrix dashboard)
    public static void main(String[] args) {

        SpringApplication.run(MicroservicesDcb4CApplication.class, args);

    }

}