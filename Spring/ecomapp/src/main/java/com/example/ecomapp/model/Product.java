package com.example.ecomapp.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


//lombok provides the getter setter features
@Data
@Entity // Any class that is mapped to a Database is called Entity
public class Product {
    @Id
    private long id;
    private String name;
    private double price;
}
