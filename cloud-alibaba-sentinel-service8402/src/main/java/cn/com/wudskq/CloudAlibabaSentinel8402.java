package cn.com.wudskq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author chenfangchao
 * @title: CloudAlibabaSentinel8402
 * @projectName spring-cloud-project
 * @description: TODO
 * @date 2022/11/6 8:35 PM
 */
@EnableDiscoveryClient
@SpringBootApplication
public class CloudAlibabaSentinel8402 {
    public static void main(String[] args) {
        SpringApplication.run(CloudAlibabaSentinel8402.class);
    }
}
