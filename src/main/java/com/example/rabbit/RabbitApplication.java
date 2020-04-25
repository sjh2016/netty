package com.example.rabbit;

import com.example.rabbit.config.RabbitConfig;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.rabbit.connection.CorrelationData;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@SpringBootApplication
@ComponentScan("com.example.rabbit.*")
@RestController
public class RabbitApplication {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @GetMapping("/send")
    public void send(){
        CorrelationData correlationId = new CorrelationData(UUID.randomUUID().toString());
        System.out.println("send***********");
        rabbitTemplate.convertAndSend(RabbitConfig.EXCHANGE,RabbitConfig.ROUTINGKEY,"你好",correlationId);
    }




    public static void main(String[] args) {
        SpringApplication.run(RabbitApplication.class, args);
    }

}
