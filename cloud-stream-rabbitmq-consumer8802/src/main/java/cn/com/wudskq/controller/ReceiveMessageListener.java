package cn.com.wudskq.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

/**
 * @author chenfangchao
 * @title: ReviceMesageListener
 * @projectName spring-cloud-project
 * @description: TODO
 * @date 2022/10/30 10:38 PM
 */
@Slf4j
@Component
@EnableBinding(Sink.class) //表示消费接收源
public class ReceiveMessageListener {


    @StreamListener(Sink.INPUT)
    private void receiveMsg(Message<String> msg){
        log.info("8802-接收到 providerExchange主题的消息为:{}",msg.getPayload());
    }

}
