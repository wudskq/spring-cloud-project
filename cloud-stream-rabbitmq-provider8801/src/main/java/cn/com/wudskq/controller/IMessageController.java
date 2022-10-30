package cn.com.wudskq.controller;

import cn.com.wudskq.service.IMessageProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chenfangchao
 * @title: IMessageController
 * @projectName spring-cloud-project
 * @description: TODO
 * @date 2022/10/30 10:16 PM
 */
@RestController
@RequestMapping("/stream/rabbit")
public class IMessageController {

    @Autowired
    private IMessageProvider iMessageProvider;

    @GetMapping("/send")
    public void send(){
        iMessageProvider.send();
    }
}
