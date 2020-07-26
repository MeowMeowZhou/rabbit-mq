package com.zyj.controller;

import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queuesToDeclare = @Queue (value = "mq-1"))
public class AcceptMsgController {

    @RabbitHandler
    public void listen(String msg){
        System.out.println(msg);
    }

}
