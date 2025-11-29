package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController{

    @GetMapping("/filter")
    public String filterProducts(@RequestParam String category) {
        return "Filtering products by category: " + category;
    }
    @GetMapping("/products")
    public String products(@RequestParam (required = false)String category){
        if(category == null)
            return "Showing all products";
        return "Showing Products Filtered By Category: " + category;
    }
    @GetMapping("/search")
    public String searchProducts(@RequestParam (defaultValue = "all") String category){
        return "Searching products in category: " + category;
    }
}
