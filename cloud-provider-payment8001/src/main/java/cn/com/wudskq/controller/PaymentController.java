package cn.com.wudskq.controller;

import cn.com.wudskq.dto.Payment;
import cn.com.wudskq.service.PaymentService;
import cn.com.wudskq.vo.CommonResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

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

    //服务发现 获取注册在erueka上的微服务名称列表
    @Autowired
    private DiscoveryClient discoveryClient;

    @Autowired
    private PaymentService paymentService;

    private static AtomicInteger integer = new AtomicInteger();

    @GetMapping("/list")
    public CommonResult<List<Payment>> list(){
        int count = integer.getAndIncrement();
        log.info("支付微服务 port:" + port + " 查询列表调用成功" + " 调用次数:" + count);
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

    @GetMapping("/discovery/info")
    public Object getDiscoveryInfo(){
        //获取注册在eureka微服务列表
        List<String> services = discoveryClient.getServices();
        for (String service : services) {
            //获取微服务的相关实例
            List<ServiceInstance> instances = discoveryClient.getInstances(service);
            //获取实例的相关信息
            for (ServiceInstance instance : instances) {

                log.info("服务名称: "+ service + " 主机地址: " + instance.getHost() + " 端口号: " + instance.getPort());
            }
        }
        return discoveryClient.getServices();
    }
}
