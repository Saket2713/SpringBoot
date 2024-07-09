package com.example.springbootwebtutorial.springbootwebtutorial.controllers;

import com.example.springbootwebtutorial.springbootwebtutorial.dto.EmployeeDTO;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@RestController
@RequestMapping(path = "/employees")

public class EmployeeController {
//    @GetMapping(path = "/getSecretMessage")
//    public String getMySuperSecretMessage(){
//        return "Secret message: asdas3432wdadd@$%Dasfdad";
//    }
    @GetMapping("/{employeeId}")
    public EmployeeDTO getEmployeeById(@PathVariable(name = "employeeId") Long id){
        return new EmployeeDTO(id,"saket",19,"saketfirake02@gmail.com", LocalDate.of(2024,4,12),true);
    }

    @GetMapping
    public String getAllEmployees(@RequestParam(required = false) Integer age){
        return "Hi there are some employees in this department and you are not allowed to join this department.";
    }
    @PostMapping
    public EmployeeDTO createNewEmployee(@RequestBody EmployeeDTO inputEmployee){
        inputEmployee.setId(100L);
        return inputEmployee;
    }

    @PutMapping String updateEmployeeById(){
        return "Hello from put";
    }

}
