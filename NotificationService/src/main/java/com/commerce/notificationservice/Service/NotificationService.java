package com.commerce.notificationservice.Service;

import com.commerce.notificationservice.DTO.Event.OrderEventDTO;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {
    public void sendOrderCreatedEmail(OrderEventDTO orderEventDTO){
        System.out.printf("EMAIL: Tu orden %s fue creada %n", orderEventDTO.getOrderId());
    }

    public void sendPaymentApprovedEmail(OrderEventDTO orderEventDTO){
        System.out.printf("EMAIL: Tu pago para la orden %s fue aprobada con un monto de $%f %n", orderEventDTO.getOrderId(), orderEventDTO.getAmount());
    }

}
