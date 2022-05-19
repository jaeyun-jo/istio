package com.example.demo;

import com.example.demo.domain.Account;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
@Service
public class AccountService {
    private final WebClient accountClient;

    @GetMapping
    public Mono<Account> getAccount(Long userId) {
        return getAccount();
    }

    private Mono<Account> getAccount() {
        return accountClient.get()
                            .uri(builder -> builder.replacePath("/accounts/1")
                                                   .build())
                            .retrieve()
                            .bodyToMono(Account.class)
                            .onErrorResume(throwable -> Mono.error(new RuntimeException("account api has error", throwable)));
    }
}