package com.example.onlineshop_frontend.clients;
import com.example.onlineshop_frontend.dto.Color;
import com.example.onlineshop_frontend.dto.Brand;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

@FeignClient(name = "onlineshop-api-brands", url = "http://localhost:8082/brand")
public interface BrandClient {

  @GetMapping("/getAllBrand")
   List<Brand> getAllBrand();

  @GetMapping("/getAllColors")
   List<Color> getAllColors();
}
