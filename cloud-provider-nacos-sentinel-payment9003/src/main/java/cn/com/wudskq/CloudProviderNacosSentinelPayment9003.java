package cn.com.wudskq;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author chenfangchao
 * @title: CloudProviderNacosSentinelPayment9003
 * @projectName spring-cloud-project
 * @description: TODO
 * @date 2022/10/22 11:12 PM
 */
@Slf4j
@MapperScan("cn.com.wudskq.mapper")
@EnableDiscoveryClient
@SpringBootApplication
public class CloudProviderNacosSentinelPayment9003 {
    public static void main(String[] args) {
        log.info("-- CloudProviderNacosSentinelPayment9003 启动中 --");
        SpringApplication.run(CloudProviderNacosSentinelPayment9003.class);
        log.info("-- CloudProviderNacosSentinelPayment9003 启动成功 --");
    }
}
