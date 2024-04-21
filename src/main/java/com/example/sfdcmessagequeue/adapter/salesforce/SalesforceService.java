package com.example.sfdcmessagequeue.adapter.salesforce;
import com.example.sfdcmessagequeue.domain.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class SalesforceService {

    @Value("${salesforce.api.url}")
    private String apiUrl;

    @Value("${salesforce.access.token}")
    private String accessToken;

    private final RestTemplate restTemplate;

    @Autowired
    public SalesforceService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    // Salesforce로 메시지 전송
    public void sendMessageToSalesforce(Message message) {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.setBearerAuth(accessToken);

        String requestBody = "{\"abc__c\": \"" + message.getContent() + "\"}";

        HttpEntity<String> requestEntity = new HttpEntity<>(requestBody, headers);
        ResponseEntity<String> responseEntity = restTemplate.exchange(apiUrl, HttpMethod.POST, requestEntity, String.class);

        if (responseEntity.getStatusCode() == HttpStatus.CREATED) {
            System.out.println("Data successfully sent to Salesforce.");
        } else {
            System.out.println("Error occurred while sending data to Salesforce: " + responseEntity.getBody());
        }
    }
}
