package com.example.ecomapp.api;


import com.example.ecomapp.model.Product;
import com.example.ecomapp.service.ProductService;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
// Request Mapping accepts any type of request like get, put, post ,delete
@RequestMapping("api/v1/products")
public class ProductController {

    private ProductService service;
    // Instead of constructor we can use @Autowired
    public ProductController(ProductService service) {
        this.service = service;
    }

    @GetMapping
    public List<Product> getAllProducts(){
        return service.getProducts();
    }

    @GetMapping("/{id}")
    public Product getProduct(@PathVariable long id){
        return service.getProductById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable long id){
        service.deleteProduct(id);
    }
    @PostMapping
    public Product addProduct(@RequestBody Product product){
        return service.saveProduct(product);
    }

}
