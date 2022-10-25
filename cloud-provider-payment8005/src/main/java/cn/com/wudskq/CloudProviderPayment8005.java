package cn.com.wudskq;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

/**
 * @author chenfangchao
 * @title: CloudProviderPayment8005
 * @projectName spring-cloud-project
 * @description: TODO
 * @date 2022/10/24 9:52 AM
 */
@Slf4j
//开启服务发现
@EnableDiscoveryClient
@EnableEurekaClient
@EnableHystrix
@MapperScan("cn.com.wudskq.mapper")
@SpringBootApplication
public class CloudProviderPayment8005 {
    public static void main(String[] args) {
        log.info("-- CloudProviderPayment8005 启动中 --");
        SpringApplication.run(CloudProviderPayment8005.class);
        log.info("-- CloudProviderPayment8005 启动成功 --");
    }
}
