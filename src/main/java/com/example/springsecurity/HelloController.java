package com.example.springsecurity;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class HelloController {

    @GetMapping("/public")
    public String publicEndpoint() {
        return "Это публичный endpoint";
    }

    @GetMapping("/secure")
    public String privateEndpoint() {
        return "Это приватный endpoint";
    }

}
