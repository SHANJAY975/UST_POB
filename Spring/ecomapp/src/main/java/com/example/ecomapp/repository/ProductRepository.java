package com.example.ecomapp.repository;

import com.example.ecomapp.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;



// we can give Repository name inside it like @Repository("name1")
public interface ProductRepository extends JpaRepository<Product, Long> {

}
