package com.commerce.OrderService.Service;

import com.commerce.OrderService.Event.OrderEventDTO;
import com.commerce.OrderService.Producer.OrderProducer;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class OrderService {
    private final OrderProducer orderProducer;

    public void createOrder(OrderEventDTO order){
        order.setOrderId(UUID.randomUUID().toString());
        order.setStatus("CREATED");
        orderProducer.sendOrder(order);
    }
}
