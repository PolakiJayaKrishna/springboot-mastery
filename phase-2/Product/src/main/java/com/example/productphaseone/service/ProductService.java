package com.example.productphaseone.service;

import com.example.productphaseone.model.Product;
import com.example.productphaseone.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository repo;


    public Product createProduct(Product product){
        return repo.save(product);
    }

    public Product getProductById(int id){
        if(repo.existsById(id)){
            return repo.findById(id).get();
        }else {
            return null;
        }
    }
    
    public List<Product> getAllProduct(){
        return repo.findAll();
    }
    
    public Product updateProduct(Product product){
        if(repo.existsById(product.getId())){
            return repo.save(product);
        }else {
            return null;
        }
    }
    
    public String deleteProduct(int id ){
        if(repo.existsById(id)){
            repo.deleteById(id);
            return "Product deleted Successfully";
        }else {
            return "Product Not Found";
        }
    }
}
