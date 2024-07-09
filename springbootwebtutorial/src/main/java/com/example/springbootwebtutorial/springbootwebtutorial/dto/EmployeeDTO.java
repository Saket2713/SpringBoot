package com.example.springbootwebtutorial.springbootwebtutorial.dto;

import java.time.LocalDate;

public class EmployeeDTO {
    private Long id;
    private String name;
    private Integer age;
    private String Email;
    private LocalDate DateOfJoining;
    private Boolean isActive;

    public EmployeeDTO(){

    }

    public EmployeeDTO(Long id, String name, Integer age, String Email, LocalDate DateOfJoining, Boolean isActive) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.Email = Email;
        this.DateOfJoining = DateOfJoining;
        this.isActive = isActive;
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public LocalDate getDateOfJoining() {
        return DateOfJoining;
    }

    public void setDateOfJoining(LocalDate dateOfJoining) {
        DateOfJoining = dateOfJoining;
    }

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }
}
