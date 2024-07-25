package com.example.onlineshop_frontend.clients;

import com.example.onlineshop_frontend.dto.ProductRequestDto;
import com.example.onlineshop_frontend.dto.ProductResponseDto;
import java.util.List;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@FeignClient(name = "onlineshop-api-accessories", url = "http://localhost:8082/accessories")
public interface AccessoryClient {

    @GetMapping("/show")
     ResponseEntity<List<ProductResponseDto>> showAllAccessory() ;

    @GetMapping("show/{id}")
    ProductResponseDto getAccessoriesById(@PathVariable(name = "id") Long id);

    @PostMapping("/add")
     ResponseEntity<ProductResponseDto> addNewAccessory(
            @RequestBody ProductRequestDto requestDto) ;

    @PutMapping("/update/{id}")
     ResponseEntity<ProductResponseDto> updateAccessory(
            @RequestBody ProductRequestDto requestDto, @PathVariable("id") Long id) ;

    @DeleteMapping("delete/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
     void deleteAccessory(@PathVariable("id") Long id);
}

