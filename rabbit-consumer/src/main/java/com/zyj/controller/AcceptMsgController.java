package com.zyj.controller;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.*;

@RestController
@RabbitListener(queues ={"TestDirectQueue"})
public class AcceptMsgController {

    @RabbitHandler
    @RequestMapping("/accept")
    public void accept(Object object){
        System.out.println(object);


    }

}
