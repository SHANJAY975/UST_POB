package com.example.ecomapp.service;

import com.example.ecomapp.model.Product;
import com.example.ecomapp.repository.ProductRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service // it helps for Dependency injection
public class ProductService {


    private ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Product saveProduct(Product product){
        productRepository.saveProduct(product);
        return product;
    }
    public List<Product> getProducts(){
        return productRepository.getProducts();
    }

    public Product getProductById(long id){
        return  productRepository.getProductById(id);
    }

    public void deleteProduct(long id){
        productRepository.deleteProduct(id);
    }
}
