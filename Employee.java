package com.example.onboardingtracker.employee;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;

@Entity
@Table(name = "employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "name is required and must not be blank")
    private String name;

    @NotBlank(message = "role is required and must not be blank")
    private String role;

    @NotNull(message = "onboardingDate is required")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate onboardingDate;

    protected Employee() {
    }

    public Employee(String name, String role, LocalDate onboardingDate) {
        this.name = name;
        this.role = role;
        this.onboardingDate = onboardingDate;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public LocalDate getOnboardingDate() {
        return onboardingDate;
    }

    public void setOnboardingDate(LocalDate onboardingDate) {
        this.onboardingDate = onboardingDate;
    }
}
