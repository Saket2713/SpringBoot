package com.example.springbootwebtutorial.springbootwebtutorial.dto;

import com.example.springbootwebtutorial.springbootwebtutorial.annotation.EmployeeRoleValidation;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.*;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class EmployeeDTO {

    private Long id;
    @NotBlank(message = "Name of employee cannot be empty")
    @Size(min = 3, max =10, message = "Number of characters should be between 3 and 10")
    private String name;

    @Max(value = 80, message = "Age should be less than 80")
    @Min(value = 18, message = "Age should be greater than 18")
    private Integer age;

    @Email(message = "Should be a valid email address")
    private String Email;

    @NotNull(message = "Role of employee cannot be null")
    //@Pattern(regexp = "^(Admin|User)$", message = "Role can be User or Admin")
    @EmployeeRoleValidation
    private String role;

    @NotNull(message = "Salary must be not null")
    @Positive(message="Salary should be positive")
    @Digits(integer = 7,fraction = 2,message = "Salary must be between in form XXXXXXX.YY")
    @DecimalMin(value ="1000.00")
    @DecimalMax(value ="9999999.0")
    private Double salary;

    @PastOrPresent(message = "Date of joining should be in the past or present")
    private LocalDate DateOfJoining;

    @AssertTrue(message = "Employee Should be active")
    @JsonProperty("isActive")
    private Boolean isActive;



}
