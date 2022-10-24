package cn.com.wudskq;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author chenfangchao
 * @title: CloudConsumerRibbonOrder80
 * @projectName spring-cloud-project
 * @description: TODO
 * @date 2022/10/23 2:59 PM
 */
@Slf4j
@EnableEurekaClient
@SpringBootApplication
public class CloudConsumerRibbonOrder80 {
    public static void main(String[] args) {
        log.info("-- CloudConsumerRibbonOrder80 启动中 --");
        SpringApplication.run(CloudConsumerRibbonOrder80.class);
        log.info("-- CloudConsumerRibbonOrder80 启动成功 --");
    }
}
