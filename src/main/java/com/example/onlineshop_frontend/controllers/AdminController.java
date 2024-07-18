package com.example.onlineshop_frontend.controllers;

import com.example.onlineshop_frontend.clients.AdminClient;
import com.example.onlineshop_frontend.dto.EmployeeDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/admin")
@RequiredArgsConstructor
public class AdminController {
    private final AdminClient adminClient;
    @GetMapping("/show-employees")
    public ResponseEntity<List<EmployeeDTO>> showEmployees(){
        return adminClient.showEmployees();
    }

    @PutMapping("/enable-employee/{id}")
    public ResponseEntity<Boolean> enableEmployee(@PathVariable("id") Long employeeId){
        return adminClient.enableEmployee(employeeId);
    }

    @PutMapping("/disable-employee/{id}")
    public ResponseEntity<Boolean> disableEmployee(@PathVariable("id") Long employeeId){
        return adminClient.disableEmployee(employeeId);
    }

    @PutMapping("/update-salary/{id}")
    public ResponseEntity<Boolean> updateEmployeeSalary(@PathVariable("id") Long id, @RequestParam("salary") String salary){
        return adminClient.updateEmployeeSalary(id, salary);
    }
}
