package com.example.onlineshop_frontend.controllers;

import com.example.onlineshop_frontend.clients.AdminClient;
import com.example.onlineshop_frontend.dto.EmployeeDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Controller
@RequestMapping("/admin")
@RequiredArgsConstructor
public class AdminController {
    private final AdminClient adminClient;

    @GetMapping("/showEmployees")
    public String showEmployees(Model model){
        ResponseEntity<List<EmployeeDTO>> employeesList = adminClient.showEmployees();
        model.addAttribute("employees", employeesList.getBody());
        return "employees_all";
    }

    @PostMapping("/updateEmployee")
    public String updateEmployee(@RequestParam Long employeeId, @RequestParam boolean employeeStatus, @RequestParam String salary){
        ResponseEntity<String> booleanResponseEntity = adminClient.updateEmployee(employeeId, employeeStatus, salary);
        return "redirect:/admin/showEmployees";
    }
}
