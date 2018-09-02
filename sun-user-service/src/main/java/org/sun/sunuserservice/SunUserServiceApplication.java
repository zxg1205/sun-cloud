package org.sun.sunuserservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;

@SpringBootApplication
@EnableDiscoveryClient
@EntityScan(basePackages={"org.sun.sunvenusdata"})
@EnableJpaRepositories(repositoryBaseClass = SimpleJpaRepository.class)
public class SunUserServiceApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(SunUserServiceApplication.class, args);
    }
}
