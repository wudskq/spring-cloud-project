package cn.com.wudskq.service;

import cn.com.wudskq.dto.Payment;
import cn.com.wudskq.service.impl.PaymentFallBackServiceImpl;
import cn.com.wudskq.vo.CommonResult;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * @author chenfangchao
 * @title: PaymentService
 * @projectName spring-cloud-project
 * @description: TODO
 * @date 2022/10/25 11:05 AM
 */
@FeignClient(value = "cloud-prodiver-service",fallback = PaymentFallBackServiceImpl.class)
@Component
public interface PaymentOpenFeignService {

    @GetMapping("/payment/list")
    CommonResult<List<Payment>> list();

    @GetMapping("/payment/timeout")
    String timeOut();

    @GetMapping("/error")
    int error();
}
