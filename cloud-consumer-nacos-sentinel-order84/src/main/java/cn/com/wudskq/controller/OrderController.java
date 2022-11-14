package cn.com.wudskq.controller;

import cn.com.wudskq.dto.Payment;
import cn.com.wudskq.vo.CommonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author chenfangchao
 * @title: OrderController
 * @projectName spring-cloud-project
 * @description: TODO
 * @date 2022/10/23 3:19 PM
 */
@RequestMapping("/order")
@RestController
public class OrderController {

//   public static final String PAYMENT_URL = "http://localhost:8001/";
    public static final String PAYMENT_URL = "http://cloud-prodiver-nacos-sentinel-service/";

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/create")
    public CommonResult create(Payment payment){
        return restTemplate.postForObject(PAYMENT_URL + "payment",payment,CommonResult.class);
    }

    @GetMapping("/{id}")
    public CommonResult query(@PathVariable("id") String id){
        return restTemplate.getForObject(PAYMENT_URL + "payment/" + id,CommonResult.class);
    }

    @GetMapping("/list")
    public CommonResult list(){
        return restTemplate.getForObject(PAYMENT_URL + "payment/list",CommonResult.class);
    }


}
