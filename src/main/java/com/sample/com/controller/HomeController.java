package com.sample.com.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@Slf4j
@RestController
public class HomeController {
    @GetMapping
    public String dsf() {
        return "ok";
    }
    @GetMapping("/dsf")
    public String dsf2() {
        return "okfd";
        // 기본 페이지로 가지고 잘 되는듯 아마?
    }
    @GetMapping("/for")
    public String consoleActuatorTest() {
        for (int i = 0; i < 100; i++) {
            log.info("i= '{}'",i);
        }
        return "ok";
    }
}
