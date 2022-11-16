package cn.com.wudskq.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author chenfangchao
 * @title: SeataOrder
 * @projectName spring-cloud-project
 * @description: TODO
 * @date 2022/11/15 3:30 PM
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SeataOrder implements Serializable {
    private static final long serialVersionUID = -2941864815633822626L;

    private Long id;

    private Long userId;

    private Long productId;

    private Integer count;

    private BigDecimal money;

    /** 订单状态：0创建中，1已完结 **/
    private Integer status;

}
