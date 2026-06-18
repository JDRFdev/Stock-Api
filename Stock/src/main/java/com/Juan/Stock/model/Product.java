package com.Juan.Stock.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name="product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name="product_name",nullable = false,length = 100)
    private String name;
    @Column(name="product_price",nullable = false)
    private float price;

}
