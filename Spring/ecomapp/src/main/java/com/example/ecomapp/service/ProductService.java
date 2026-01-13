package com.example.ecomapp.service;

import com.example.ecomapp.model.Product;
import com.example.ecomapp.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service // it helps for Dependency injection
public class ProductService {


    private ProductRepository productRepo;

    public ProductService(ProductRepository productRepo) {
        this.productRepo = productRepo;
    }

    public Product saveProduct(Product product){
        productRepo.saveProduct(product);
        return product;
    }
    public List<Product> getProducts(){
        return productRepo.getProducts();
    }

    public Product getProductById(long id){
        return  productRepo.getProductById(id);
    }

    public void deleteProduct(long id){
        productRepo.deleteProduct(id);
    }
    public Product getProductByName(String name){
        return productRepo.getProductByName(name);
    }

    public List<Product> getProductInRange(int min, int max){
        return productRepo.getProductInRange(min, max);
    }
}
