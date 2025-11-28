package com.example.productphaseone.controller;

import com.example.productphaseone.model.Product;
import com.example.productphaseone.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductService service;

    @PostMapping("/product")
    public Product create(@RequestBody Product product){
        return service.createProduct(product);
    }

    @GetMapping("/product/{id}")
    public Object getById(@PathVariable int id){
        Product product =  service.getProductById(id);
        if (product != null)
            return  product;
        else
            return "Product Not found";
    }

    @GetMapping("/product")
    public List<Product> getAll(){
        return service.getAllProduct();
    }

    @PutMapping("/product")
    public Object update(@RequestBody Product product){
        Product updated = service.updateProduct(product);
        if(updated != null)
            return updated;
        else
            return "Product Not Found";
    }

    @DeleteMapping("/product/{id}")
    public String delete(@PathVariable int id){
        return service.deleteProduct(id);
    }
}
