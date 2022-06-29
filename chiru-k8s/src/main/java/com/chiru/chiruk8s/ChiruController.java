package com.chiru.chiruk8s.ws;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JhooqController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello - Chiranjeevi";
    }
}
