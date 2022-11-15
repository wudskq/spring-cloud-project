package cn.com.wudskq.dto;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author chenfangchao
 * @title: SeataOrder
 * @projectName spring-cloud-project
 * @description: TODO
 * @date 2022/11/15 3:30 PM
 */
@TableName("t_storage")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SeataStorage implements Serializable {
    private static final long serialVersionUID = -2941864815633822626L;

    @TableId("id")
    private Long id;

    private Long productId;

    private Integer total;

    private Long used;

    private Long residue;


}
