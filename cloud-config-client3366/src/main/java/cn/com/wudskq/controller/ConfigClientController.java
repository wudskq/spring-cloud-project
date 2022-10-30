package cn.com.wudskq.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chenfangchao
 * @title: ConfigClientController
 * @projectName spring-cloud-project
 * @description: TODO
 * @date 2022/10/28 8:19 PM
 */
//实现刷新功能 curl -X POST "http://192.168.1.101:3355/actuator/refresh"
@RefreshScope
@RequestMapping("/config/client")
@RestController
public class ConfigClientController {

    @Value("${config.info}")
    public String info;

    @GetMapping("/info")
    public String getApplicationConfigInfo(){
        return info;
    }

}
