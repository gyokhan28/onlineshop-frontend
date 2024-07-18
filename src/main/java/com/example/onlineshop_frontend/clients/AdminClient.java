package com.example.onlineshop_frontend.clients;

import com.example.onlineshop_frontend.dto.EmployeeDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(name = "onlineshop-api-admin", url = "http://localhost:8082/admin")
public interface AdminClient {
    @GetMapping("/show-employees")
    public ResponseEntity<List<EmployeeDTO>> showEmployees();

    @PutMapping("/enable-employee/{id}")
    public ResponseEntity<Boolean> enableEmployee(@PathVariable("id") Long employeeId);

    @PutMapping("/disable-employee/{id}")
    public ResponseEntity<Boolean> disableEmployee(@PathVariable("id") Long employeeId);

    @PutMapping("/update-salary/{id}")
    public ResponseEntity<Boolean> updateEmployeeSalary(@PathVariable("id") Long id, @RequestParam("salary") String salary);
}
