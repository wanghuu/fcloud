package me.frank.fcloud.configclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author Frank Wang
 * @Description:
 * @date 2018/8/3 15:52
 */
@EnableDiscoveryClient
@SpringBootApplication
public class ConfigClient {
    public static void main(String[] args) {
        SpringApplication.run(ConfigClient.class, args);
    }
}
