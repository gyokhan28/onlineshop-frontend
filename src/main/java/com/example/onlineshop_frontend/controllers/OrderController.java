package com.example.onlineshop_frontend.controllers;

import com.example.onlineshop_frontend.clients.OrderClient;
import com.example.onlineshop_frontend.dto.OrderDTO;
import com.example.onlineshop_frontend.enums.OrderStatusType;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.time.LocalDateTime;
import java.util.Objects;
import java.util.Optional;

@Controller
@RequestMapping("/orders")
@RequiredArgsConstructor
public class OrderController {

    private final OrderClient orderClient;

    @GetMapping("/show")

    public String showOrders(Model model) {
        model.addAttribute("orders", orderClient.showOrders().getBody());
        model.addAttribute("statuses", OrderStatusType.values());
        return "orders_all";
    }

    @PostMapping("/changeStatus")
    public String changeOrderStatus(@RequestParam Long orderId, @RequestParam Long statusId, RedirectAttributes redirectAttributes) {
        //OrderDTO order = orderClient.viewSingleOrder(orderId).getBody();
//        if(order.getStatus().getName().equalsIgnoreCase("DELIVERED")){
//            order.setOrderDeliveryDateTime(LocalDateTime.now());
//        }
        orderClient.changeOrderStatus(orderId, statusId);
        return "redirect:/orders/show";
    }

    @GetMapping("/show/{id}")
    public String viewSingleOrder(@PathVariable Long id, Model model) {
        model.addAttribute("order", orderClient.viewSingleOrder(id).getBody());
        model.addAttribute("statuses", OrderStatusType.values());
        return "orders_single";
    }
}