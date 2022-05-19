package com.example.demo;

import com.example.demo.dto.TreatmentDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@Slf4j
@RestController
@RequestMapping("/treatments")
@RequiredArgsConstructor
public class TreatmentController {
    private final TreatmentService treatmentService;

    @GetMapping("/{treatmentId}")
    public Mono<TreatmentDto> getTreatments(@PathVariable Long treatmentId) {
        return treatmentService.getTreatments(treatmentId);
    }
}