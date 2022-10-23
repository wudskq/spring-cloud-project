package cn.com.wudskq.controller;

import cn.com.wudskq.dto.Payment;
import cn.com.wudskq.service.PaymentService;
import cn.com.wudskq.vo.CommonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author chenfangchao
 * @title: PaymentController
 * @projectName spring-cloud-project
 * @description: TODO
 * @date 2022/10/23 1:16 AM
 */
@RestController
@RequestMapping("/payment")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @GetMapping("/list")
    public CommonResult<List<Payment>> list(){
        return new CommonResult<List<Payment>>().success(paymentService.list());
    }

    @GetMapping("/{id}")
    public CommonResult<Payment> query(@PathVariable("id") String id){
        return new CommonResult<Payment>().success(paymentService.query(id));
    }

    @PostMapping
    public CommonResult save(@RequestBody Payment payment){
        paymentService.save(payment);
        return new CommonResult().success();
    }

    @PutMapping
    public CommonResult edit(@RequestBody Payment payment){
        paymentService.edit(payment);
        return new CommonResult().success();
    }

    @DeleteMapping
    public CommonResult delete(@RequestParam("ids") List<String> ids){
        paymentService.delete(ids);
        return new CommonResult().success();
    }


}
