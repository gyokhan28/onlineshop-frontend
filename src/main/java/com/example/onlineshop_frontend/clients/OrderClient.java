package com.example.onlineshop_frontend.clients;

import com.example.onlineshop_frontend.dto.OrderDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(name = "onlineshop-api", url = "http://localhost:8082/orders")
public interface OrderClient {
    @GetMapping("/show")
        //Backend api-то връща некоректен json.
        //ResponseEntity<OrderDTO>  showOrders();
    String showOrders();

    @PutMapping("/change-status")
    ResponseEntity<Boolean> changeOrderStatus(@RequestParam Long orderId, @RequestParam Long statusId);

    @GetMapping("/show/{id}")
        //Backend api-то връща некоректен json.
        //ResponseEntity<?> viewSingleOrder(@PathVariable("id") Long orderId);
    String viewSingleOrder(@PathVariable("id") Long orderId);

}
