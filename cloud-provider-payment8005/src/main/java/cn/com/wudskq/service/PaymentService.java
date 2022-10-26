package cn.com.wudskq.service;

import cn.com.wudskq.dto.Payment;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @author chenfangchao
 * @title: PatmentService
 * @projectName spring-cloud-project
 * @description: TODO
 * @date 2022/10/23 1:13 AM
 */
public interface PaymentService {

    /**
     * 查询
     * @return
     */
    List<Payment> list();

    /**
     * 详情
     * @param id
     * @return
     */
    Payment query(String id);

    /**
     * 新增
     * @param payment
     */
    void save(Payment payment);

    /**
     * 更新
     * @param payment
     */
    void edit(Payment payment);


    /**
     * 删除
     * @param ids
     */
    void delete(List<String> ids);


    /**
     * 服务降级异常模拟
     * @return
     */
    int error();

    /**
     * 服务降级超时模拟
     * @return
     */
    String timeOut();

    /**
     * 服务熔断模拟
     * @param i
     * @return
     */
    String paymentBreak(@RequestParam("i") Integer i);
}
