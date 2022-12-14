package cn.com.wudskq.service.impl;

import cn.com.wudskq.dto.Payment;
import cn.com.wudskq.mapper.PaymentMapper;
import cn.com.wudskq.service.PaymentService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.beans.factory.annotation.Autowired;
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
}
