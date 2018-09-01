package org.sun.sunzullserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SunZullServerApplication
{

    public static void main(String[] args)
    {
        SpringApplication.run(SunZullServerApplication.class, args);
    }
}
