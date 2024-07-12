package com.example.springbootwebtutorial.springbootwebtutorial.entities;


import jakarta.persistence.*;
import jdk.jfr.Enabled;
import lombok.*;

import java.time.LocalDate;
@Entity
@Enabled
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "employees")
public class EmployeeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long id;
    private String name;
    private Integer age;
    private String Email;
    private LocalDate DateOfJoining;
    private Boolean isActive;
}
