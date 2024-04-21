package com.example.sfdcmessagequeue.adapter.rest;

import com.example.sfdcmessagequeue.application.MessageApplicationService;
import com.example.sfdcmessagequeue.domain.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

    @Autowired
    private MessageApplicationService messageApplicationService;

    //클라이언트 테스트 전용 post
    @PostMapping("/send")
    public ResponseEntity<String> sendMessage(@RequestBody String content) {
        Message message = new Message(content);
        messageApplicationService.sendMessage(message);
        return ResponseEntity.status(HttpStatus.CREATED).body("Message sent successfully.");
    }
}
