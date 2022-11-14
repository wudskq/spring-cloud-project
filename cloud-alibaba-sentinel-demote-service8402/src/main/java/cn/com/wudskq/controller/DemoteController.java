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
@RequestMapping("/demote")
@RestController
public class DemoteController {


    @GetMapping("/Rt")
    public String Rt(){
        try {
            Thread.sleep(2000);
            return "平均时长访问成功";
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return null;
    }

    @GetMapping("/Exception")
    public String Exception(){
        int i  = 10/0;
        return null;
    }

}
