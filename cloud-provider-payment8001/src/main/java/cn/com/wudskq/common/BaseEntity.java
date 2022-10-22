package cn.com.wudskq.common;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

/**
 * @author chenfangchao
 * @title: BaseEntity
 * @projectName spring-cloud-project
 * @description: TODO
 * @date 2022/10/23 1:11 AM
 */
@Data
@ToString
public class BaseEntity implements Serializable {

    private static final long serialVersionUID = -290848621917623713L;

    @TableField("create_time")
    private Date createTime;

    @TableField("update_time")
    private Date updateTime;
}
