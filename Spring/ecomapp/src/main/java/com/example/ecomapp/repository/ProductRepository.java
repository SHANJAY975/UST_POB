package com.example.ecomapp.repository;

import com.example.ecomapp.model.Product;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository("repo1")
// we can give Repository name inside it like @Repository("name1")
public class ProductRepository {
    List<Product> products;

    @PostConstruct
    void init(){
        products = new ArrayList<>();
        products.add(new Product(1,"iphone 17", 83000));
        products.add(new Product(2,"Vivo", 19000));
        products.add(new Product(3,"samsung", 40000));
        products.add(new Product(4,"poco", 15000));
    }
    public Product saveProduct(Product product){
        products.add(product);
        return product;
    }
    public List<Product> getProducts(){
        return products;
    }

    public Product getProductById(long id){
        return products.stream().filter(p -> p.getId() == id).findFirst().orElse(null);
    }

    public void deleteProduct(long id){
        products.removeIf(p-> p.getId() == id);
    }
    public Product getProductByName(String name){
        return products.stream().filter(p-> p.getName().equalsIgnoreCase(name)).findFirst().orElse(null);
    }

    public List<Product> getProductInRange(int min, int max){
        return products.stream().filter(p-> p.getPrice() >=min && p.getPrice() <= max).toList();
    }
}
