package cn.com.wudskq.service;

import cn.com.wudskq.dto.Payment;

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

}
