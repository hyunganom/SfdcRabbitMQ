package com.example.sfdcmessagequeue;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class SfdcMessageQueueApplication {
    public static void main(String[] args) {
        SpringApplication.run(SfdcMessageQueueApplication.class, args);
    }
}
