package cn.com.wudskq.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author lixiaolong
 * @date 2019-12-11 16:57
 */
@Configuration
@MapperScan({"cm.com.wudskq.mapper"})
public class MyBatisConfig {
}
