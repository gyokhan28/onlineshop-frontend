package com.example.onlineshop_frontend.controllers;

import com.example.onlineshop_frontend.clients.AccessoryClient;
import com.example.onlineshop_frontend.clients.BrandClient;
import com.example.onlineshop_frontend.dto.ProductRequestDto;
import com.example.onlineshop_frontend.dto.ProductResponseDto;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/accessories")
@RequiredArgsConstructor
public class AccessoryController {

  private final AccessoryClient accessoryClient;
  private final BrandClient brandClient;

  @GetMapping("/show")
  public String showAllAccessories(Model model) {
    ResponseEntity<List<ProductResponseDto>> allAccessories = accessoryClient.showAllAccessory();
    model.addAttribute("allAccessories", allAccessories);
    return "Accessories/accessories_all";
  }

  @GetMapping("/create")
  String createAccessory(Model model) {
    model.addAttribute("brands", brandClient.getAllBrand());
    model.addAttribute("colors", brandClient.getAllColors());
    model.addAttribute("requestDto",  new ProductRequestDto());
    return "Accessories/create";
    }
    @PostMapping("/create/submit")
    ModelAndView submitAccessory(ProductRequestDto dto) {
    accessoryClient.addNewAccessory(dto);
      return new ModelAndView("redirect:/accessories/show");
  }

//  @GetMapping("/edit/{id}")
//  String editAccessory(@PathVariable(name = "id") Long id, Model model) {
//    Accessory existingCarton = accessoryClient.(id);
//    model.addAttribute(CARTONTXT, existingCarton);
//    return "Carton/edit";
//  }

  @PostMapping("/delete/{id}")
  @ResponseStatus(HttpStatus.NO_CONTENT)
  public ModelAndView deleteAccessory(@PathVariable("id") Long id) {
    accessoryClient.deleteAccessory(id);
    return new ModelAndView("redirect:/accessories/show");
  }
}
