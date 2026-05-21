package com.commerce.OrderService.Event;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderEventDTO {
    private String orderId;
    private String customer;
    private Double amount;
    private String status;
}
