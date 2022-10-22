package cn.com.wudskq.dto;

import cn.com.wudskq.common.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.io.Serializable;

/**
 * @author chenfangchao
 * @title: Payment
 * @projectName spring-cloud-project
 * @description: TODO
 * @date 2022/10/23 1:09 AM
 */

@TableName("payment")
@Data
@EqualsAndHashCode(callSuper = true)
@ToString
public class Payment extends BaseEntity implements Serializable {

    private static final long serialVersionUID = -3197679591560280716L;

    @TableField("id")
    private Long id;

    @TableField("serial")
    private String serial;

}
