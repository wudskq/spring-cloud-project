package cn.com.wudskq.controller;

import cn.com.wudskq.dto.SeataOrder;
import cn.com.wudskq.service.SeataOrderService;
import cn.com.wudskq.vo.CommonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chenfangchao
 * @title: SeataOrderController
 * @projectName spring-cloud-project
 * @description: TODO
 * @date 2022/11/15 3:15 PM
 */
@RestController
@RequestMapping("/seata/order")
public class SeataOrderController {

    @Autowired
    private SeataOrderService seataOrderService;

    //http://127.0.0.1:2001/seata/order/create?userId=1&productId=1&count=10&money=10
    @GetMapping("/create")
    public CommonResult createOrder(SeataOrder seataOrder){
        seataOrderService.create(seataOrder);
        return new CommonResult(200,"订单下单成功!");
    }

}
