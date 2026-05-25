package com.commerce.notificationservice.Consumer.Order;

import com.commerce.notificationservice.DTO.Event.OrderEventDTO;
import com.commerce.notificationservice.Service.NotificationService;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
import tools.jackson.databind.ObjectMapper;

@Service
public class OrderNotificationConsumer {

        private final NotificationService notificationService;
        private final ObjectMapper objectMapper;

        public OrderNotificationConsumer(NotificationService notificationService, ObjectMapper objectMapper) {
            this.notificationService = notificationService;
            this.objectMapper = objectMapper;
        }

        @KafkaListener(topics = "orders-topic", groupId = "notification-group")
        public void consume(String message){
            try {
                OrderEventDTO orderEventDTO = objectMapper.readValue(message, OrderEventDTO.class);

                notificationService.sendOrderCreatedEmail(orderEventDTO);

            }catch (Exception e){
                System.err.println("Error procesando mensaje de Kafka");
                e.printStackTrace();
            }
        }
}
