package com.example.onlineshop_frontend.controllers;

import com.example.onlineshop_frontend.clients.AccessoryClient;
import com.example.onlineshop_frontend.dto.ProductResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/accessories")
@RequiredArgsConstructor
public class AccessoryController {

  private final AccessoryClient accessoryClient;

  @GetMapping("/show")
  public String showAllAccessories(Model model) {
    ResponseEntity<List<ProductResponseDto>> allAccessories = accessoryClient.showAllAccessory();
    model.addAttribute("allAccessories", allAccessories);
    return "Accessories/accessories_all";
  }

  @PostMapping("delete/{id}")
  @ResponseStatus(HttpStatus.NO_CONTENT)
  public ModelAndView deleteAccessory(@PathVariable("id") Long id) {
    accessoryClient.deleteAccessory(id);
    return new ModelAndView("redirect:/accessories/show");
  }
}
