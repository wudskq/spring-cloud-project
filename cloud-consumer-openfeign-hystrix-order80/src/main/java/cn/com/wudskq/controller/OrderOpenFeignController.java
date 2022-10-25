package cn.com.wudskq.controller;

import cn.com.wudskq.dto.Payment;
import cn.com.wudskq.service.PaymentOpenFeignService;
import cn.com.wudskq.vo.CommonResult;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author chenfangchao
 * @title: OpenFeignController
 * @projectName spring-cloud-project
 * @description: TODO
 * @date 2022/10/25 11:32 AM
 */
@RestController
@RequestMapping("/order/consumer")
public class OrderOpenFeignController {

    @Autowired
    private PaymentOpenFeignService paymentOpenFeignService;

    @GetMapping("/list")
    public CommonResult<List<Payment>> list(){
        return paymentOpenFeignService.list();
    }


    @HystrixCommand(fallbackMethod = "fallbackOne",commandProperties = {
            @HystrixProperty(name="execution.isolation.thread.timeoutInMilliseconds",value = "1500")
    })  //服务超时、兜底方案
    @GetMapping("/timeout")
    public String timeOut(){
        return paymentOpenFeignService.timeOut();
    }

    @HystrixCommand(fallbackMethod = "fallbackTwo",commandProperties = {
            @HystrixProperty(name="execution.isolation.thread.timeoutInMilliseconds",value = "1500")
    }) //服务异常、兜底方案
    @GetMapping("/error")
    public String error(){
        return String.valueOf(paymentOpenFeignService.error());
    }


    public String fallbackOne(){
        return "服务超时～、请稍后再试!";
    }

    public String fallbackTwo(){
        return "服务异常～、请稍后再试!";
    }

}
