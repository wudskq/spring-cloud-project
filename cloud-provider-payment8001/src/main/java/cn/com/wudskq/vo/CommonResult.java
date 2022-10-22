package cn.com.wudskq.vo;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author chenfangchao
 * @title: CommonResult
 * @projectName spring-cloud-project
 * @description: TODO
 * @date 2022/10/23 1:25 AM
 */
@Data
@NoArgsConstructor
public class CommonResult<T> implements Serializable {

    private static final long serialVersionUID = 4132740890030776798L;

    private int code;
    private String message;
    private T data;

    public CommonResult(int code, String message) {
        this.code = code;
        this.message = message;
    }


    public CommonResult(int code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public CommonResult<T> success(){
        this.code = 200;
        this.message = "请求成功";
        return this;
    }

    public CommonResult<T> success(T data){
        this.code = 200;
        this.message = "请求成功";
        this.data = data;
        return this;
    }


}
