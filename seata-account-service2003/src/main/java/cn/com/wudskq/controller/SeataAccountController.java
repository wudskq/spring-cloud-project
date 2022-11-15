package cn.com.wudskq.controller;

import cn.com.wudskq.service.SeataAccountService;
import cn.com.wudskq.vo.CommonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

/**
 * @author chenfangchao
 * @title: SeataAccountController
 * @projectName spring-cloud-project
 * @description: TODO
 * @date 2022/11/15 3:15 PM
 */
@RestController
public class SeataAccountController {

    @Autowired
    private SeataAccountService seataAccountService;


    @PostMapping("/account/decrease")
    public CommonResult decreaseAccount(@RequestParam("userId")Long userId, @RequestParam("money") BigDecimal money){
        seataAccountService.decreaseAccount(userId,money);
        return new CommonResult(200,"请求成功");
    }

}
