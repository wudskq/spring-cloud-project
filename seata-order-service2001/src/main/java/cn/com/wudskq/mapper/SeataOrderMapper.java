package cn.com.wudskq.mapper;

import cn.com.wudskq.dto.SeataOrder;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author chenfangchao
 * @title: SeataOrderMapper
 * @projectName spring-cloud-project
 * @description: TODO
 * @date 2022/11/15 3:15 PM
 */
@Mapper
public interface SeataOrderMapper {

    /**
     * 新增订单
     * @param seataOrder
     */
    void save(@Param("seataOrder") SeataOrder seataOrder);


    /**
     * 修改订单状态
     * @param seataOrder
     */
    void edit(@Param("seataOrder")SeataOrder seataOrder);
}
