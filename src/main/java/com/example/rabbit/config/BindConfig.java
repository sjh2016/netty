package com.example.rabbit.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BindConfig {

    @Bean
    Binding bindingExchangeMessage(@Qualifier("queue") Queue queue, @Qualifier("exchange") TopicExchange topicExchange){
        System.out.println("****************************************");
        return BindingBuilder.bind(queue).to(topicExchange).with(RabbitConfig.ROUTINGKEY);
    }

}
