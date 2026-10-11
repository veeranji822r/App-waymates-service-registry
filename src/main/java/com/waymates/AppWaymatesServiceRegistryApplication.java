package com.waymates;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
@SpringBootApplication
@EnableEurekaServer
public class AppWaymatesServiceRegistryApplication {
    public static void main(String[] args) {
        SpringApplication.run(AppWaymatesServiceRegistryApplication.class, args);
    }
}
