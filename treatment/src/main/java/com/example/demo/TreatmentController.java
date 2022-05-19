package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/treatments")
public class TreatmentController {

    @GetMapping("/{treatmentId}")
    public Treatment getTreatment(@PathVariable Long treatmentId) {
        return Treatment.builder()
                        .id(treatmentId)
                        .userId(1L)
                        .startDate(LocalDateTime.now())
                        .endDate(LocalDateTime.now().plusHours(1))
                        .build();
    }
}