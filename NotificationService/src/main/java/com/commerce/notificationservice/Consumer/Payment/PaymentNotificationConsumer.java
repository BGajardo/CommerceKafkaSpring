package com.commerce.notificationservice.Consumer.Payment;

import com.commerce.notificationservice.Service.NotificationService;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
import tools.jackson.databind.ObjectMapper;

@Service
public class PaymentNotificationConsumer {

    private final NotificationService notificationService;
    private final ObjectMapper objectMapper;
    private final String TOPIC_NAME = "payment-topic";
    private final String GROUP_ID = "notification-payment-group";

    public PaymentNotificationConsumer(NotificationService notificationService, ObjectMapper objectMapper) {
        this.notificationService = notificationService;
        this.objectMapper = objectMapper;
    }
    @KafkaListener(topics = TOPIC_NAME, groupId = GROUP_ID)
    private void consume(String message){
        try{

        // Class<?> DTO = objectMapper.readValue(message, ?);

        }catch (Exception e){
            System.err.println("Error procesando mensaje de Kafka");
            e.printStackTrace();
        }
    }



}
