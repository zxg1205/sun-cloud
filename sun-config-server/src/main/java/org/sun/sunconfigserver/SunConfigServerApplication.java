package org.sun.sunconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableDiscoveryClient
@EnableConfigServer
public class SunConfigServerApplication
{

    public static void main(String[] args)
    {
        SpringApplication.run(SunConfigServerApplication.class, args);
    }
}
