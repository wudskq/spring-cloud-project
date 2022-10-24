package cn.com.wudskq;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author chenfangchao
 * @title: CloudProviderPayment8004
 * @projectName spring-cloud-project
 * @description: TODO
 * @date 2022/10/24 9:52 AM
 */
@Slf4j
//开启服务发现
@EnableDiscoveryClient
@MapperScan("cn.com.wudskq.mapper")
@SpringBootApplication
public class CloudProviderPayment8004 {
    public static void main(String[] args) {
        log.info("-- CloudProviderPayment8004 启动中 --");
        SpringApplication.run(CloudProviderPayment8004.class);
        log.info("-- CloudProviderPayment8004 启动成功 --");
    }
}
