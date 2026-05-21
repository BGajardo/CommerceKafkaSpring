package com.commerce.OrderService.Producer;

import com.commerce.OrderService.Event.OrderEventDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class OrderProducer {

    private final KafkaTemplate<String, OrderEventDTO> kafkaTemplate;

    public void sendOrder(OrderEventDTO event){
        kafkaTemplate.send("orders-topic", event);
        System.out.println("ORDEN ENVIADA A KAFKA");
    }

}
