package cn.com.rule.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author chenfangchao
 * @title: RibbonConfiguration
 * @projectName spring-cloud-project
 * @description: TODO 自定义Ribbon负载均衡路由策略
 * @date 2022/10/24 5:21 PM
 */
@Configuration
public class RibbonConfiguration {

    /**
     * 负载均衡:随机策略
     * @return
     */
    @Bean
    public IRule randomRule(){
        return new RandomRule();
    }

}
