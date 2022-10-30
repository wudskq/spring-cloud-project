package cn.com.wudskq.service.impl;

import cn.com.wudskq.service.IMessageProvider;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;

import java.util.UUID;


/**
 * @author chenfangchao
 * @title: IMessageProviderImpl
 * @projectName spring-cloud-project
 * @description: TODO
 * @date 2022/10/30 10:03 PM
 */
@Slf4j
@EnableBinding(Source.class) //定义消息发送管道-消息生产源头
public class IMessageProviderImpl implements IMessageProvider {

   //消息信道
   @Autowired
   private MessageChannel output;

    @Override
    public String send() {
        String msg = UUID.randomUUID().toString();
        //构建消息
        output.send(MessageBuilder.withPayload(msg).build());
        log.info(msg);
        return null;
    }
}
