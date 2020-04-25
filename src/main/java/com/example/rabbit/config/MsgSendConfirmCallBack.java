package com.example.rabbit.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.connection.CorrelationData;
import org.springframework.amqp.rabbit.core.RabbitTemplate;

/**
 * 消息发送到交换机确认机制
 */
@Slf4j
public class MsgSendConfirmCallBack implements RabbitTemplate.ConfirmCallback {
    @Override
    public void confirm(CorrelationData correlationData, boolean b, String s) {
        System.out.println("MsgSendConfirmCallBack,回调id："+correlationData);
        if (b){
            System.out.println("消息发送到交换机成功");
        }else{
            System.out.println("消息发送到交换机失败"+s);
        }


    }
}
