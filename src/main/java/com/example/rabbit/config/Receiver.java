package com.example.rabbit.config;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class Receiver {
    //监听队列queue-a
    @RabbitListener(queues = "queue")
    public void process(String message) {
        System.out.println("接收端Receiver  : " + message);
    }
}
