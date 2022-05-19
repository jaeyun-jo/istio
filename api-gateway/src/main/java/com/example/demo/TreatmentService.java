package com.example.demo;

import com.example.demo.domain.Account;
import com.example.demo.domain.Payment;
import com.example.demo.domain.Treatment;
import com.example.demo.dto.TreatmentDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
@Service
public class TreatmentService {
    private final WebClient accountClient;
    private final WebClient treatmentClient;
    private final WebClient paymentClient;

    @GetMapping("/{treatmentId}")
    public Mono<TreatmentDto> getTreatments(Long treatmentId) {
        return Mono.zip(getAccount(), getTreatment(), getPayment())
                   .map(t -> assembleTreatment(t.getT1(), t.getT2(), t.getT3()));
    }

    private TreatmentDto assembleTreatment(Account patient, Treatment treatment, Payment payment) {
        return TreatmentDto.builder()
                           .id(treatment.getId())
                           .patientName(patient.getName())
                           .gender(patient.getGender())
                           .birthDate(patient.getBirthDate())
                           .treatmentStartDate(treatment.getStartDate())
                           .treatmentEndDate(treatment.getEndDate())
                           .paymentStatus(payment.getStatus())
                           .paymentAmount(payment.getAmount())
                           .build();
    }

    private Mono<Account> getAccount() {
        return accountClient.get()
                              .uri(builder -> builder.replacePath("/accounts/1")
                                                     .build())
                              .retrieve()
                              .bodyToMono(Account.class)
                              .onErrorResume(throwable -> Mono.error(new RuntimeException("account api has error", throwable)));
    }

    private Mono<Treatment> getTreatment() {
        return treatmentClient.get()
                              .uri(builder -> builder.replacePath("/treatments/1")
                                                     .build())
                              .retrieve()
                              .bodyToMono(Treatment.class)
                              .onErrorResume(throwable -> Mono.error(new RuntimeException("treatment api has error", throwable)));
    }

    private Mono<Payment> getPayment() {
        return paymentClient.get()
                              .uri(builder -> builder.replacePath("/payments")
                                                     .queryParam("treatmentId", 1L)
                                                     .build())
                              .retrieve()
                              .bodyToMono(Payment.class)
                              .onErrorResume(throwable -> Mono.error(new RuntimeException("payment api has error", throwable)));
    }
}