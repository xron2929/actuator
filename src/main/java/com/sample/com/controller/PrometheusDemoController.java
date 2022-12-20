package com.sample.com.controller;

import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.MeterRegistry;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;

@RequiredArgsConstructor
@RestController
public class PrometheusDemoController {
    private final MeterRegistry metalRegistry;
    private Counter counter;
    @PostConstruct
    public void init() {
        counter = metalRegistry.counter("api.call.count");
    }

    @GetMapping("/api/count")
    public void count() {
        counter.increment();
    }

}
