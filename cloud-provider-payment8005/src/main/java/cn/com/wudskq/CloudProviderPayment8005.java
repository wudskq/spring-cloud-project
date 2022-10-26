package cn.com.wudskq;

import com.netflix.hystrix.contrib.metrics.eventstream.HystrixMetricsStreamServlet;
import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.HystrixMetricsProperties;
import org.springframework.context.annotation.Bean;

import javax.servlet.Servlet;
import javax.servlet.ServletRegistration;

/**
 * @author chenfangchao
 * @title: CloudProviderPayment8005
 * @projectName spring-cloud-project
 * @description: TODO
 * @date 2022/10/24 9:52 AM
 */
@Slf4j
//开启服务发现
@EnableDiscoveryClient
@EnableEurekaClient
@EnableHystrix
@MapperScan("cn.com.wudskq.mapper")
@SpringBootApplication
public class CloudProviderPayment8005 {
    public static void main(String[] args) {
        log.info("-- CloudProviderPayment8005 启动中 --");
        SpringApplication.run(CloudProviderPayment8005.class);
        log.info("-- CloudProviderPayment8005 启动成功 --");
    }

    /**
     * *此配置是为广限务监控而秘電，与服务容错本身无关，springcloud升级后的坑
     * *servletRegistrationBean因springboot的默认路经不是"/hystrix.stream"，
     * *只要在自己的项目里配置上下面用servlet就可以了
     * @return
     */
    @Bean
    public ServletRegistrationBean getServlet(){
        HystrixMetricsStreamServlet streamServlet = new HystrixMetricsStreamServlet();
        ServletRegistrationBean<Servlet> registrationBean = new ServletRegistrationBean<>(streamServlet);
        registrationBean.setLoadOnStartup(1);
        registrationBean.addUrlMappings("/hystrix.stream");
        registrationBean.setName("HystrixMetricsStreamServlet");
        return registrationBean;
    }
}
