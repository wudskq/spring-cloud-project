package cn.com.wudskq.service.impl;

import cn.com.wudskq.dto.Payment;
import cn.com.wudskq.service.PaymentOpenFeignService;
import cn.com.wudskq.vo.CommonResult;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author chenfangchao
 * @title: PaymentFallBackService
 * @projectName spring-cloud-project
 * @description: TODO
 * @date 2022/10/26 10:33 AM
 */
@Component
public class PaymentFallBackServiceImpl implements PaymentOpenFeignService {

    @Override
    public CommonResult<List<Payment>> list() {
        return new CommonResult("系统繁忙-fallback");
    }

    @Override
    public String timeOut() {
        return "系统超时-fallback";
    }

    @Override
    public int error() {
        return 500;
    }
}
