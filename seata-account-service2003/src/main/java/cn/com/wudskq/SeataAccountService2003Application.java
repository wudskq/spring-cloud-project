package cn.com.wudskq;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author chenfangchao
 * @title: SeataAccountService2003Application
 * @projectName spring-cloud-project
 * @description: TODO
 * @date 2022/11/15 11:37 AM
 */
@MapperScan(basePackages = "cn.com.wudskq.mapper")
@SpringBootApplication
public class SeataAccountService2003Application {
    public static void main(String[] args) {
        SpringApplication.run(SeataAccountService2003Application.class);
    }
}
