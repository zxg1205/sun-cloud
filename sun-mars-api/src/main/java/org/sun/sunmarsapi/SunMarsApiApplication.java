package org.sun.sunmarsapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.FeignClient;

@SpringBootApplication
@EnableDiscoveryClient
@FeignClient
public class SunMarsApiApplication
{

    public static void main(String[] args)
    {
        SpringApplication.run(SunMarsApiApplication.class, args);
    }
}
