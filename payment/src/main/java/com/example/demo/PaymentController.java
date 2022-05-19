package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payments")
public class PaymentController {
    @GetMapping
    public Payment getPayment(Long treatmentId) {
        return Payment.builder().id(1L).amount(10000).status("COMPELETED").build();
    }
}