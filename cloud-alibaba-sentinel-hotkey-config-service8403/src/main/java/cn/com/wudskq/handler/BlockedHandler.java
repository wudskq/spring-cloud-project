package cn.com.wudskq.handler;

import com.alibaba.csp.sentinel.slots.block.BlockException;

/**
 * @author chenfangchao
 * @title: BlockedHandler
 * @projectName spring-cloud-project
 * @description: TODO
 * @date 2022/11/14 4:23 PM
 */
public class BlockedHandler {

    public static String blockHandler1(BlockException e){
        return "自定义限流快速失败!";
    }


}
