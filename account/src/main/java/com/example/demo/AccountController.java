package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
@RequestMapping("/accounts")
public class AccountController {
    @GetMapping("/{userId}")
    public Account getAccount() {
        return Account.builder()
                      .name("김환자")
                      .gender("MALE")
                      .birthDate(LocalDate.now().minusYears(30))
                      .build();
    }
}