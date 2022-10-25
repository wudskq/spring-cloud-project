package cn.com.wudskq.controller;

import cn.com.wudskq.dto.Payment;
import cn.com.wudskq.service.PaymentOpenFeignService;
import cn.com.wudskq.vo.CommonResult;
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

}
