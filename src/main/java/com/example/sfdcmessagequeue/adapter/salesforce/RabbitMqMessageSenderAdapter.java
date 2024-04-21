package com.example.sfdcmessagequeue.adapter.salesforce;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RabbitMqMessageSenderAdapter {

    //니중에 chat GPT데이터를 여기다가 보낼꺼임

//    @Autowired
//    private AmqpTemplate amqpTemplate;
//
//    // RabbitMQ에 메시지 전송
//    public void sendMessage(String message) {
//        amqpTemplate.convertAndSend("sfdctest", message);
//    }
}