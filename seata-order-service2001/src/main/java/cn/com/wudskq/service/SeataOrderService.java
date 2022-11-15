package cn.com.wudskq.service;

import cn.com.wudskq.dto.SeataOrder;

/**
 * @author chenfangchao
 * @title: SeataOrderService
 * @projectName spring-cloud-project
 * @description: TODO
 * @date 2022/11/15 3:27 PM
 */
public interface SeataOrderService {

    /**
     * 创建订单
     * @param seataOrder
     */
    void create(SeataOrder seataOrder);

    /**
     * 更新订单
     * @param seataOrder
     */
    void update(SeataOrder seataOrder);

}
