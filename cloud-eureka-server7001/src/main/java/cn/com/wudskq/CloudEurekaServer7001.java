package cn.com.wudskq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author chenfangchao
 * @title: CloudEurekaServer7001
 * @projectName spring-cloud-project
 * @description: TODO
 * @date 2022/10/23 4:50 PM
 */
@EnableEurekaServer
@SpringBootApplication
public class CloudEurekaServer7001 {
    public static void main(String[] args) {
        SpringApplication.run(CloudEurekaServer7001.class);
    }
}
