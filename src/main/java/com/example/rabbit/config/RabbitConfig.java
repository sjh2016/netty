package com.example.rabbit.config;



import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 基础配置类
 */
@Configuration
public class RabbitConfig {

    //队列名称
    public static final String QUEUE ="queue";

    //路由器
    public static final String ROUTINGKEY = "routingKey";

    //交换机
    public static final String EXCHANGE = "exchange";

    //队列
    @Bean("queue")
    public Queue queue(){
        return new Queue(QUEUE,true);
    }

    //交换机
    @Bean("exchange")
    public TopicExchange exchange(){
        return new TopicExchange(EXCHANGE);
    }

    @Bean
    public MsgSendConfirmCallBack msgSendConfirmCallBack(){
            return new MsgSendConfirmCallBack();
    }

    @Bean
    public RabbitTemplate rabbitTemplate(ConnectionFactory connectionFactory, MsgSendConfirmCallBack msgSendConfirmCallBack){
        RabbitTemplate rabbitTemplate = new RabbitTemplate(connectionFactory);

        System.out.println("*********************************************  ");
        rabbitTemplate.setConfirmCallback(msgSendConfirmCallBack);
        return rabbitTemplate;
    }
}
