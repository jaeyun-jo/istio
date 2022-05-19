package com.example.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TreatmentDto {
    private Long id;
    private String patientName;
    private String gender;
    private LocalDate birthDate;
    private LocalDateTime treatmentStartDate;
    private LocalDateTime treatmentEndDate;
    private String paymentStatus;
    private Integer paymentAmount;
}
