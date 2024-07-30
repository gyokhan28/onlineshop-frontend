package com.example.onlineshop_frontend.clients;

import com.example.onlineshop_frontend.dto.ProductCreationRequestDto;
import com.example.onlineshop_frontend.dto.ProductRequestDto;
import com.example.onlineshop_frontend.dto.ProductResponseDto;
import java.util.List;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@FeignClient(name = "onlineshop-api-products", url = "http://localhost:8082/products")
public interface ProductClient {

  @GetMapping("/show")
  public ResponseEntity<List<ProductResponseDto>> getAll();

  @GetMapping("show/{id}")
  ProductResponseDto getAccessoriesById(@PathVariable(name = "id") Long id);

  @PostMapping("/add")
  public ResponseEntity<ProductResponseDto> create(
          @RequestBody ProductCreationRequestDto requestDto);

  @PutMapping("/update/{id}")
  public ResponseEntity<ProductResponseDto> update(
      @RequestBody ProductRequestDto requestDto, @PathVariable("id") Long id);

  @DeleteMapping("/delete/{id}")
  @ResponseStatus(HttpStatus.NO_CONTENT)
  public void deleteAccessory(@PathVariable("id") Long id);
}
