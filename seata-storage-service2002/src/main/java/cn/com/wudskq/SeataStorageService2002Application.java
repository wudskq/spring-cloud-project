package cn.com.wudskq;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author chenfangchao
 * @title: SeataStorageService2002Application
 * @projectName spring-cloud-project
 * @description: TODO
 * @date 2022/11/15 11:37 AM
 */
@MapperScan(basePackages = "cn.com.wudskq.mapper")
@SpringBootApplication
public class SeataStorageService2002Application {
    public static void main(String[] args) {
        SpringApplication.run(SeataStorageService2002Application.class);
    }
}
