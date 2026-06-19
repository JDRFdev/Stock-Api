package com.Juan.Stock.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Entity
@Data
@Table(name="product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name="product_name",nullable = false,length = 100)
    @NotNull(message = "Name cannot be null")
    @Size(min = 2,max = 100,message = "Name must be between 2 and 100 characters")
    private String name;
    @NotNull(message = "Price is required")
    @Min(value = 0,message = "Price must be greater than or equal to 0")
    @Column(name="product_price",nullable = false)
    private Float price;

}
