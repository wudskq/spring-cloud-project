package cn.com.wudskq.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author chenfangchao
 * @title: SpringContextConfig
 * @projectName spring-cloud-project
 * @description: TODO
 * @date 2022/10/23 3:20 PM
 */
@Configuration
public class ApplicationContextConfig {

    @Bean("restTemplate")
//    @LoadBalanced //添加rest远程调用负载均衡功能
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
