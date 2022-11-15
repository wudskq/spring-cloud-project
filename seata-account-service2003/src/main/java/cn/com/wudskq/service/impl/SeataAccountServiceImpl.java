package cn.com.wudskq.service.impl;

import cn.com.wudskq.dto.SeataAccount;
import cn.com.wudskq.mapper.SeataAccountMapper;
import cn.com.wudskq.service.SeataAccountService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
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
            QueryWrapper<SeataAccount> queryWrapper = new QueryWrapper<>();
            queryWrapper.eq("user_id",userId);
            SeataAccount seataAccount = seataAccountMapper.selectOne(queryWrapper);
            //余额减少
            seataAccount.setTotal(seataAccount.getTotal()-money.longValue());
            //已使用增多
            seataAccount.setUsed(seataAccount.getUsed()+money.longValue());
            //未使用减少
            seataAccount.setResidue(seataAccount.getResidue()-money.longValue());
            UpdateWrapper<SeataAccount> updateWrapper = new UpdateWrapper<>();
            updateWrapper.eq("user_id",userId);
            seataAccountMapper.update(seataAccount,updateWrapper);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
