package cn.com.wudskq.controller;

import cn.com.wudskq.dto.Payment;
import cn.com.wudskq.service.PaymentService;
import cn.com.wudskq.vo.CommonResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author chenfangchao
 * @title: PaymentController
 * @projectName spring-cloud-project
 * @description: TODO
 * @date 2022/10/23 1:16 AM
 */
@Slf4j
@RestController
@RequestMapping("/payment")
public class PaymentController {

    @Value("${server.port}")
    private String port;

    @Autowired
    private PaymentService paymentService;

    @GetMapping("/list")
    public CommonResult<List<Payment>> list(){
        log.info("支付微服务 port:" + port + "查询列表调用成功");
        return new CommonResult<List<Payment>>().success(paymentService.list());
    }

    @GetMapping("/{id}")
    public CommonResult<Payment> query(@PathVariable("id") String id){
        log.info("支付微服务 port:" + port + "查询详情调用成功");
        return new CommonResult<Payment>().success(paymentService.query(id));
    }

    @PostMapping
    public CommonResult save(@RequestBody Payment payment){
        log.info("支付微服务 port:" + port + "保存支付流水调用成功");
        paymentService.save(payment);
        return new CommonResult().success();
    }

    @PutMapping
    public CommonResult edit(@RequestBody Payment payment){
        log.info("支付微服务 port:" + port + "编辑支付流水调用成功");
        paymentService.edit(payment);
        return new CommonResult().success();
    }

    @DeleteMapping
    public CommonResult delete(@RequestParam("ids") List<String> ids){
        log.info("支付微服务 port:" + port + "删除支付流水调用成功");
        paymentService.delete(ids);
        return new CommonResult().success();
    }


}
