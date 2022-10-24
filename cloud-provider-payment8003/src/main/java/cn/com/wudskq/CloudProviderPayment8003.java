package cn.com.wudskq;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author chenfangchao
 * @title: CloudProviderPayment8003
 * @projectName spring-cloud-project
 * @description: TODO
 * @date 2022/10/24 9:52 AM
 */
@Slf4j
//开启服务发现
@EnableDiscoveryClient
@MapperScan("cn.com.wudskq.mapper")
@SpringBootApplication
public class CloudProviderPayment8003 {
    public static void main(String[] args) {
        log.info("-- CloudProviderPayment8003 启动中 --");
        SpringApplication.run(CloudProviderPayment8003.class);
        log.info("-- CloudProviderPayment8003 启动成功 --");
    }
}
