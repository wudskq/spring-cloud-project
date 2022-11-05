package cn.com.wudskq;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author chenfangchao
 * @title: CloudConsumerNacosOrder80
 * @projectName spring-cloud-project
 * @description: TODO
 * @date 2022/10/23 2:59 PM
 */
@Slf4j
@EnableDiscoveryClient
@SpringBootApplication
public class CloudConsumerNacosOrder80 {
    public static void main(String[] args) {
        log.info("-- CloudConsumerNacosOrder80 启动中 --");
        SpringApplication.run(CloudConsumerNacosOrder80.class);
        log.info("-- CloudConsumerNacosOrder80 启动成功 --");
    }
}
