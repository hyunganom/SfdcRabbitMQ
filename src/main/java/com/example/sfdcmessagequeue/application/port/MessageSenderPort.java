package com.example.sfdcmessagequeue.application.port;

import com.example.sfdcmessagequeue.domain.Message;

public interface MessageSenderPort {
    void sendMessage(Message message);
}
