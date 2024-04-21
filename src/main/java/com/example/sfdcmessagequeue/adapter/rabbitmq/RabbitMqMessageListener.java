package com.example.sfdcmessagequeue.adapter.rabbitmq;

import com.example.sfdcmessagequeue.application.MessageApplicationService;
import com.example.sfdcmessagequeue.domain.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RabbitMqMessageListener {

    @Autowired
    private MessageApplicationService messageApplicationService;

    @RabbitListener(queues = "sfdctest")
    public  void processMessage(Message message) {
        messageApplicationService.sendMessage(message);
    }
}
