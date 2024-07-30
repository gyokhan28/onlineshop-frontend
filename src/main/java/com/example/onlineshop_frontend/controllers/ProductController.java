package com.example.onlineshop_frontend.controllers;

import com.example.onlineshop_frontend.clients.ProductClient;
import com.example.onlineshop_frontend.clients.BrandClient;
import com.example.onlineshop_frontend.dto.*;

import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/products")
@RequiredArgsConstructor
public class ProductController {

  private final ProductClient productClient;
  private final BrandClient brandClient;

  @GetMapping("/show")
  public String showAllAccessories(Model model) {
    ResponseEntity<List<ProductResponseDto>> allProducts = productClient.getAll();
    model.addAttribute("allProducts", allProducts);
    return "Product/products_all";
  }
  @GetMapping("/create")
  public String showCreateForm(Model model) {
    model.addAttribute("productCreationRequestDto", new ProductCreationRequestDto());
    model.addAttribute("brands", brandClient.getAllBrand());
    model.addAttribute("colors", brandClient.getAllColors());
    return "Product/create";
  }
    @PostMapping("/create/submit")
    ModelAndView submitAccessory(ProductCreationRequestDto requestDto) {
    productClient.create(requestDto);
      return new ModelAndView("redirect:/products/show");
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
    productClient.deleteAccessory(id);
    return new ModelAndView("redirect:/accessories/show");
  }
}
