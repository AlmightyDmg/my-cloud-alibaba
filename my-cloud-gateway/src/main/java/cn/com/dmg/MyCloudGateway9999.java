package cn.com.dmg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class MyCloudGateway9999 {
    public static void main(String[] args){
        SpringApplication.run(MyCloudGateway9999.class,args);
    }
}

