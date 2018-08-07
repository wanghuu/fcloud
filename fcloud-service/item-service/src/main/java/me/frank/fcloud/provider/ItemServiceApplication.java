package me.frank.fcloud.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * @author Frank Wang
 * @Description:
 * @date 2018/8/3 17:09
 */
@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class ItemServiceApplication {
    public static void main(String[] args) { SpringApplication.run(ItemServiceApplication.class, args); }
}
