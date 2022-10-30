package cn.com.wudskq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author chenfangchao
 * @title: CloudStreamRabbitmqConsumer8803
 * @projectName spring-cloud-project
 * @description: TODO
 * @date 2022/10/30 9:38 PM
 */
@EnableEurekaClient
@SpringBootApplication
public class CloudStreamRabbitmqConsumer8803 {
    public static void main(String[] args) {
        SpringApplication.run(CloudStreamRabbitmqConsumer8803.class);
    }
}
