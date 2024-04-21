package com.example.sfdcmessagequeue.application;

import com.example.sfdcmessagequeue.adapter.salesforce.SalesforceService;
import com.example.sfdcmessagequeue.application.port.MessageSenderPort;
import com.example.sfdcmessagequeue.domain.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessageApplicationService implements MessageSenderPort {


    @Autowired
    private SalesforceService salesforceService;

    @Override
    public void sendMessage(Message message) {
        salesforceService.sendMessageToSalesforce(message);
    }
}
