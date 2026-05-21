package com.commerce.OrderService.Controller;

import com.commerce.OrderService.Event.OrderEventDTO;
import com.commerce.OrderService.Service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/orders")
@RequiredArgsConstructor
public class OrderController {

    private final OrderService orderService;

    @PostMapping
    public String createOrder(@RequestBody OrderEventDTO order){
        orderService.createOrder(order);
        return "ORDER CREATED";
    }


}
