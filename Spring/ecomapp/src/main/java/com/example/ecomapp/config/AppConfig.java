package com.example.ecomapp.config;

import com.example.ecomapp.repository.ProductRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class AppConfig {

    @Bean
    // we can give bean name inside it like @Bean("name1")
    @Primary // primary is added to tell the compiler to use this incase of two object conflict
    ProductRepository getProductRepository(){
        return new ProductRepository();
    }
}
