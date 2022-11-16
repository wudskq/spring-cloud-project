package cn.com.wudskq.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author chenfangchao
 * @title: SeataStorageMapper
 * @projectName spring-cloud-project
 * @description: TODO
 * @date 2022/11/15 3:15 PM
 */
@Mapper
public interface SeataStorageMapper{

    /**
     * 根据商品ID减少库存
     * @param productId
     * @param count
     */
    void decreaseStorageByProductId(@Param("productId") Long productId,@Param("count") Integer count);
}
