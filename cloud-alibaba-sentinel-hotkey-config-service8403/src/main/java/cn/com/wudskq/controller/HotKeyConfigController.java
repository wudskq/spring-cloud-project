package cn.com.wudskq.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chenfangchao
 * @title: FlowLimitController
 * @projectName spring-cloud-project
 * @description: TODO
 * @date 2022/11/6 8:45 PM
 */
@RequestMapping("/hot/key")
@RestController
public class HotKeyConfigController {


    @GetMapping("/req")
    @SentinelResource(value = "req",blockHandler = "blockHandlerMethod")
    public String hotKey(@RequestParam(value = "par1",required = false)String par1,@RequestParam(value = "par2",required = false)String par2){
        return "热点key访问正常";
    }

    public String blockHandlerMethod(String par1, String par2, BlockException e){
        return "热点key访问失败";
    }

    @GetMapping("/req/url")
    @SentinelResource(value = "requrl")
    public String hotKeyUrl(@RequestParam(value = "par1",required = false)String par1,@RequestParam(value = "par2",required = false)String par2){
        return "热点key访问正常";
    }

}
