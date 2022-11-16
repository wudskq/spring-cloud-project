package cn.com.wudskq.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;

/**
 * @author chenfangchao
 * @title: SeataAccountMapper
 * @projectName spring-cloud-project
 * @description: TODO
 * @date 2022/11/15 3:15 PM
 */
@Mapper
public interface SeataAccountMapper{

    /**
     * 根据用户ID减少余额
     * @param userId
     * @param money
     */
    void decreaseAccountByUserId(@Param("userId") Long userId,@Param("money") BigDecimal money);
}
