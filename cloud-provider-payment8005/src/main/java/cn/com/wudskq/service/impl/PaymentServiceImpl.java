package cn.com.wudskq.service.impl;

import cn.com.wudskq.dto.Payment;
import cn.com.wudskq.mapper.PaymentMapper;
import cn.com.wudskq.service.PaymentService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.netflix.hystrix.HystrixCommandProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author chenfangchao
 * @title: PaymentServiceImpl
 * @projectName spring-cloud-project
 * @description: TODO
 * @date 2022/10/23 1:15 AM
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    private PaymentMapper paymentMapper;


    @Override
    public List<Payment> list() {
        QueryWrapper<Payment> queryWrapper = new QueryWrapper<>();
        return paymentMapper.selectList(queryWrapper);
    }

    @Override
    public Payment query(String id) {
        QueryWrapper<Payment> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("id",id);
        return paymentMapper.selectOne(queryWrapper);
    }

    @Override
    public void save(Payment payment) {
        paymentMapper.insert(payment);
    }

    @Override
    public void edit(Payment payment) {
        QueryWrapper<Payment> wrapper = new QueryWrapper<>();
        wrapper.eq("id",payment.getId());
        paymentMapper.update(payment,wrapper);
    }

    @Override
    public void delete(List<String> ids) {
        paymentMapper.deleteBatchIds(ids);
    }

    /**
     * 当前服务不可用、即马上需要做服务降级
     * @return
     */
    @HystrixCommand(fallbackMethod = "fallbackTwo",commandProperties = {
            @HystrixProperty(name="execution.isolation.thread.timeoutInMilliseconds",value = "3000")
    })
    @Override
    public int error() {
        int i = 9 / 0;
        return i;
    }


    @HystrixCommand(fallbackMethod = "fallbackOne",commandProperties = {
            @HystrixProperty(name="execution.isolation.thread.timeoutInMilliseconds",value = "3000")
    }) //代表3000以内代表正常、如何超过回调兜底方法
    @Override
    public String timeOut() {
        try {
            Thread.sleep(5000);
            return Thread.currentThread().getName();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return null;
    }

    public String fallbackOne(){
        return "服务超时～、请稍后再试!";
    }

    public int fallbackTwo(){
        return 0;
    }

}
