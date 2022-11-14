package cn.com.wudskq.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chenfangchao
 * @title: FlowLimitController
 * @projectName spring-cloud-project
 * @description: TODO
 * @date 2022/11/6 8:45 PM
 */
@RequestMapping("/flow/limit")
@RestController
public class FlowLimitController {


    @GetMapping("/a")
    public String a(){
        return "a";
    }

    @GetMapping("/b")
    public String b() throws InterruptedException {
        Thread.sleep(1000);
        return "b";
    }

}
