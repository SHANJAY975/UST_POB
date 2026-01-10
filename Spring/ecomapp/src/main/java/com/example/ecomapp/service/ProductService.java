package com.example.ecomapp.service;

import com.example.ecomapp.model.Product;
import com.example.ecomapp.repository.ProductRepository;

import java.util.List;
import java.util.ArrayList;


public class ProductService {

    private ProductRepository productRepository = new ProductRepository();
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
