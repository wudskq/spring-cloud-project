package cn.com.wudskq;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author chenfangchao
 * @title: CloudProviderNacosSentinelPayment9004
 * @projectName spring-cloud-project
 * @description: TODO
 * @date 2022/10/22 11:12 PM
 */
@Slf4j
@MapperScan("cn.com.wudskq.mapper")
@EnableDiscoveryClient
@SpringBootApplication
public class CloudProviderNacosSentinelPayment9004 {
    public static void main(String[] args) {
        log.info("-- CloudProviderNacosSentinelPayment9004 启动中 --");
        SpringApplication.run(CloudProviderNacosSentinelPayment9004.class);
        log.info("-- CloudProviderNacosSentinelPayment9004 启动成功 --");
    }
}
