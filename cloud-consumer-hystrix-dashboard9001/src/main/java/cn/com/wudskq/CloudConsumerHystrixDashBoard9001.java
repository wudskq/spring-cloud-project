package cn.com.wudskq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @author chenfangchao
 * @title: CloudConsumerHystrixDashBorad9001
 * @projectName spring-cloud-project
 * @description: TODO
 * @date 2022/10/26 4:17 PM
 */
@EnableHystrixDashboard
@SpringBootApplication
public class CloudConsumerHystrixDashBoard9001 {
    public static void main(String[] args) {
        SpringApplication.run(CloudConsumerHystrixDashBoard9001.class);
    }
}
