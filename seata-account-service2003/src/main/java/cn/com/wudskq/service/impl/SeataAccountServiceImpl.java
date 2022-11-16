package cn.com.wudskq.service.impl;

import cn.com.wudskq.mapper.SeataAccountMapper;
import cn.com.wudskq.service.SeataAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

/**
 * @author chenfangchao
 * @title: SeataAccountServiceImpl
 * @projectName spring-cloud-project
 * @description: TODO
 * @date 2022/11/15 5:08 PM
 */
@Service
public class SeataAccountServiceImpl implements SeataAccountService {

    @Autowired
    private SeataAccountMapper seataAccountMapper;

    @Override
    public void decreaseAccount(Long userId, BigDecimal money) {
        //模拟支付服务超时
        try {
            Thread.sleep(10000);
            seataAccountMapper.decreaseAccountByUserId(userId,money);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
