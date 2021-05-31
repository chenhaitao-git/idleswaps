package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@ServletComponentScan
@EnableDiscoveryClient
@EnableFeignClients
@RefreshScope   //开启配置更新功能
public class TestOneServiceApplication {

    public static void main(String[] args) {

        SpringApplication.run(TestOneServiceApplication.class, args);
    }
}