package com.example.demo;

import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class RequestResponseController {

    @GetMapping("/greet")
    public String greet(@RequestParam String name) {
        return "Hello " + name;
    }

    @PostMapping("/echo")
    public Map<String, Object> echo(@RequestBody Map<String, Object> body) {
        return body;
    }
}