package com.example.demo;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/products")
public class ProductController {

    private final Map<Integer, String> products = new HashMap<>();

    @PostMapping
    public String addProduct(@RequestParam int id, @RequestParam String name) {
        products.put(id, name);
        return "Added";
    }

    @GetMapping("/{id}")
    public String getProduct(@PathVariable int id) {
        return products.get(id);
    }

    @PutMapping("/{id}")
    public String updateProduct(@PathVariable int id, @RequestParam String name) {
        products.put(id, name);
        return "Updated";
    }

    @DeleteMapping("/{id}")
    public String deleteProduct(@PathVariable int id) {
        products.remove(id);
        return "Deleted";
    }
}