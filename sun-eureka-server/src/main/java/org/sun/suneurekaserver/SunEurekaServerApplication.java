package org.sun.suneurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SunEurekaServerApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(SunEurekaServerApplication.class, args);
    }
}
