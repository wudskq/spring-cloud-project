package cn.com.wudskq;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author chenfangchao
 * @title: CloudProviderPayment8001
 * @projectName spring-cloud-project
 * @description: TODO
 * @date 2022/10/22 11:12 PM
 */
@Slf4j
@MapperScan("cn.com.wudskq.mapper")
@EnableEurekaClient
@EnableDiscoveryClient
@SpringBootApplication
public class CloudProviderPayment8001 {
    public static void main(String[] args) {
        log.info("-- CloudProviderPayment8001 启动中 --");
        SpringApplication.run(CloudProviderPayment8001.class);
        log.info("-- CloudProviderPayment8001 启动成功 --");
    }
}
