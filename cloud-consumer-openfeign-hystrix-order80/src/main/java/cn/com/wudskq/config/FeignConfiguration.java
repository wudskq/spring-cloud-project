package cn.com.wudskq.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author chenfangchao
 * @title: FeignConfiguration
 * @projectName spring-cloud-project
 * @description: TODO
 * @date 2022/10/25 11:43 PM
 */
@Configuration
public class FeignConfiguration {

    /**
     * 配置feign日志级别
     * @return
     */
    @Bean
    public Logger.Level feignLoggerLevel(){
        return Logger.Level.FULL;
    }
}
