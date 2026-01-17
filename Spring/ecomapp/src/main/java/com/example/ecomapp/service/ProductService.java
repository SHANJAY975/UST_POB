package com.example.ecomapp.service;

import com.example.ecomapp.model.Product;
import com.example.ecomapp.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service // it helps for Dependency injection
public class ProductService {


    private ProductRepository productRepo;

    public ProductService( ProductRepository productRepo) {
        this.productRepo = productRepo;
    }

    public Product saveProduct(Product product){
        return productRepo.save(product);
    }
    public List<Product> getProducts(){
        return productRepo.findAll();
    }

    public Product getProductById(long id){
        return  productRepo.findById(id).get();
    }

    public void deleteProduct(long id){
        productRepo.deleteById(id);
    }
//    public Product getProductByName(String name){
//        return productRepo.findBy(  name.equalsIgnoreCase(name));
//    }
//
//    public List<Product> getProductInRange(int min, int max){
//        return productRepo.getProductInRange(min, max);
//    }
}
