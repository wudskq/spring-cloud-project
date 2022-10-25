package cn.com.wudskq;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author chenfangchao
 * @title: CloudConsumerOpenFeignOrder80
 * @projectName spring-cloud-project
 * @description: TODO
 * @date 2022/10/23 2:59 PM
 */
@Slf4j
@EnableEurekaClient
@EnableFeignClients
@SpringBootApplication
public class CloudConsumerOpenFeignOrder80 {
    public static void main(String[] args) {
        log.info("-- CloudConsumerOpenFeignOrder80 启动中 --");
        SpringApplication.run(CloudConsumerOpenFeignOrder80.class);
        log.info("-- CloudConsumerOpenFeignOrder80 启动成功 --");
    }
}
