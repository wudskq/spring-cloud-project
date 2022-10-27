package cn.com.wudskq;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author chenfangchao
 * @title: CloudGateway9527
 * @projectName spring-cloud-project
 * @description: TODO
 * @date 2022/10/28 12:30 AM
 */
@Slf4j
@EnableEurekaClient
@EnableDiscoveryClient
@SpringBootApplication
public class CloudGateway9527 {
    public static void main(String[] args) {
        log.info("-- CloudGateway9527 启动中 --");
        SpringApplication.run(CloudGateway9527.class);
        log.info("-- CloudGateway9527 启动成功 --");
    }
}
