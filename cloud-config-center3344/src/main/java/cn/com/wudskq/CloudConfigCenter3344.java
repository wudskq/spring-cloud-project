package cn.com.wudskq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author chenfangchao
 * @title: CloudConfigCenter3344
 * @projectName spring-cloud-project
 * @description: TODO
 * @date 2022/10/28 5:34 PM
 */
@EnableConfigServer
@EnableEurekaClient
@EnableDiscoveryClient
@SpringBootApplication
public class CloudConfigCenter3344 {
    public static void main(String[] args) {
        SpringApplication.run(CloudConfigCenter3344.class);
    }
}
