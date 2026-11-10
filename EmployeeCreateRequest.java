package com.example.onboardingtracker.employee;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;

public record EmployeeCreateRequest(
        @NotBlank(message = "name is required and must not be blank")
        String name,

        @NotBlank(message = "role is required and must not be blank")
        String role,

        @NotNull(message = "onboardingDate is required")
        @JsonFormat(pattern = "yyyy-MM-dd")
        LocalDate onboardingDate
) {
}
