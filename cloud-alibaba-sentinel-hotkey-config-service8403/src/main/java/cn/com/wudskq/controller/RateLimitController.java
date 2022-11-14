package cn.com.wudskq.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chenfangchao
 * @title: ReatLimitController
 * @projectName spring-cloud-project
 * @description: TODO
 * @date 2022/11/14 10:44 AM
 */
@RestController
public class RateLimitController {


    @GetMapping("/byResource")
    @SentinelResource(value = "byResource",blockHandler = "byResourceHandler")
    public String byResource(){
        return "By Resource 访问正常";
    }

    public String byResourceHandler(BlockException exception){
        return "By Resource 访问失败";
    }


    @GetMapping("/byUrl")
    @SentinelResource(value = "byUrl")
    public String byUrl(){
        return "By Url 访问正常";
    }

    public String byUrlHandler(BlockException exception){
        return "By Url 访问失败";
    }



}
