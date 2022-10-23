package cn.com.wudskq.dto;


import lombok.Data;
import lombok.ToString;
import java.io.Serializable;

/**
 * @author chenfangchao
 * @title: Payment
 * @projectName spring-cloud-project
 * @description: TODO
 * @date 2022/10/23 1:09 AM
 */

@Data
@ToString
public class Payment implements Serializable {

    private static final long serialVersionUID = -3197679591560280716L;

    private Long id;

    private String serial;

}
