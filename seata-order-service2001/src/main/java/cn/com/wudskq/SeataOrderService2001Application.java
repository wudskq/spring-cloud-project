package cn.com.wudskq;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author chenfangchao
 * @title: SeataOrderService2001Application
 * @projectName spring-cloud-project
 * @description: TODO
 * @date 2022/11/15 11:37 AM
 */
@EnableDiscoveryClient
@EnableFeignClients
@MapperScan(basePackages = "cn.com.wudskq.mapper")
@SpringBootApplication
public class SeataOrderService2001Application {
    public static void main(String[] args) {
        SpringApplication.run(SeataOrderService2001Application.class);
    }
}
