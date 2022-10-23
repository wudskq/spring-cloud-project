package cn.com.wudskq;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author chenfangchao
 * @title: CloudProviderPayment8002
 * @projectName spring-cloud-project
 * @description: TODO
 * @date 2022/10/22 11:12 PM
 */
@Slf4j
@MapperScan("cn.com.wudskq.mapper")
@EnableEurekaClient
@SpringBootApplication
public class CloudProviderPayment8002 {
    public static void main(String[] args) {
        log.info("-- CloudProviderPayment8002 启动中 --");
        SpringApplication.run(CloudProviderPayment8002.class);
        log.info("-- CloudProviderPayment8002 启动成功 --");
    }
}
