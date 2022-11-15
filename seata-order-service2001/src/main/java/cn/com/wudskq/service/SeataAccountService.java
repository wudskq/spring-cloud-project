package cn.com.wudskq.service;

import cn.com.wudskq.vo.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;

/**
 * @author chenfangchao
 * @title: SeataAccountService
 * @projectName spring-cloud-project
 * @description: TODO
 * @date 2022/11/15 5:09 PM
 */
@FeignClient(value = "seata-account-service")
public interface SeataAccountService {

    /**
     * 根据用户ID减少余额
     * @param userId
     * @param money
     * @return
     */
    @PostMapping("/account/decrease")
    CommonResult decrease(@RequestParam("userId")Long userId, @RequestParam("money") BigDecimal money);
}
