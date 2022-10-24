package cn.com.wudskq;

import cn.com.rule.config.RibbonConfiguration;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @author chenfangchao
 * @title: CloudConsumerRibbonOrder80
 * @projectName spring-cloud-project
 * @description: TODO
 * @date 2022/10/23 2:59 PM
 */
@Slf4j
@RibbonClient(name = "cloud-prodiver-service",configuration = RibbonConfiguration.class) //告诉application使用哪种负载均衡规则
@EnableEurekaClient
@SpringBootApplication
public class CloudConsumerRibbonOrder80 {
    public static void main(String[] args) {
        log.info("-- CloudConsumerRibbonOrder80 启动中 --");
        SpringApplication.run(CloudConsumerRibbonOrder80.class);
        log.info("-- CloudConsumerRibbonOrder80 启动成功 --");
    }
}
