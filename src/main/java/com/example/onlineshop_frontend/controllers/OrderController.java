package com.example.onlineshop_frontend.controllers;

import com.example.onlineshop_frontend.clients.OrderClient;
import com.example.onlineshop_frontend.dto.OrderDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/orders")
@RequiredArgsConstructor
public class OrderController {

    private final OrderClient orderClient;

    @GetMapping("/show")

//    public ResponseEntity<OrderDTO> showOrders(){
//        return orderClient.showOrders();
//    }
    public String showOrders() {
        return orderClient.showOrders();
    }

    @PutMapping("/change-status")
    public ResponseEntity<Boolean> changeOrderStatus(@RequestParam Long orderId, @RequestParam Long statusId) {
        return orderClient.changeOrderStatus(orderId, statusId);
    }

    @GetMapping("/show/{id}")
//    public ResponseEntity<?> viewSingleOrder(@PathVariable("id") Long orderId){
//        return orderClient.viewSingleOrder(orderId);
//    }
    public String viewSingleOrder(@PathVariable("id") Long orderId) {
        return orderClient.viewSingleOrder(orderId);
    }
}