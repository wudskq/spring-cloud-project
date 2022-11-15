package cn.com.wudskq.service;

import java.math.BigDecimal;

/**
 * @author chenfangchao
 * @title: SeataAccountService
 * @projectName spring-cloud-project
 * @description: TODO
 * @date 2022/11/15 5:08 PM
 */
public interface SeataAccountService {

    /**
     * 根据用户ID减少用户余额
     * @param userId
     * @param money
     */
    void decreaseAccount(Long userId, BigDecimal money);
}
