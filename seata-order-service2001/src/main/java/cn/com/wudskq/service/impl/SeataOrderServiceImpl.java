package cn.com.wudskq.service.impl;

import cn.com.wudskq.dto.SeataOrder;
import cn.com.wudskq.mapper.SeataOrderMapper;
import cn.com.wudskq.service.SeataAccountService;
import cn.com.wudskq.service.SeataOrderService;
import cn.com.wudskq.service.SeataStorageService;
import io.seata.spring.annotation.GlobalTransactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author chenfangchao
 * @title: SeataOrderService
 * @projectName spring-cloud-project
 * @description: TODO
 * @date 2022/11/15 3:27 PM
 */
@Slf4j
@Service
public class SeataOrderServiceImpl implements SeataOrderService {

    @Autowired
    private SeataOrderMapper seataOrderMapper;

    @Autowired
    private SeataStorageService seataStorageService;

    @Autowired
    private SeataAccountService seataAccountService;

    //添加分布式事务
    @GlobalTransactional(name="wudskq-cloud-tx-create-order",rollbackFor = Exception.class)
    @Override
    public void create(SeataOrder seataOrder) {
        log.info("---订单开始新增---");
        seataOrderMapper.save(seataOrder);
        log.info("---订单微服务开始调用库存微服务---库存开始扣减---");
        seataStorageService.decrease(seataOrder.getProductId(),seataOrder.getCount());
        log.info("---订单微服务开始调用账户微服务---余额开始扣减---");
        seataAccountService.decrease(seataOrder.getUserId(),seataOrder.getMoney());
        log.info("---订单状态开始修改---");
        seataOrderMapper.edit(seataOrder);
        log.info("---订单完成---");
    }

}
