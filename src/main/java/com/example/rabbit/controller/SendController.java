package com.example.rabbit.controller;

import com.example.rabbit.config.RabbitConfig;
import org.springframework.amqp.rabbit.connection.CorrelationData;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController()
public class SendController {

    @Autowired
    private RabbitTemplate rabbitTemplate;

//    @GetMapping("/send")
//    public void send(){
//        CorrelationData correlationId = new CorrelationData(UUID.randomUUID().toString());
//        System.out.println("send***********");
//        rabbitTemplate.convertAndSend(RabbitConfig.EXCHANGE,RabbitConfig.ROUTINGKEY,"你好",correlationId);
//    }
}
