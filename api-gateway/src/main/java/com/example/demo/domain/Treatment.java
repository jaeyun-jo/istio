package com.example.demo.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Treatment {
    private Long id;
    private Long userId;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
}