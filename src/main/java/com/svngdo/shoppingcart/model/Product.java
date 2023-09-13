package com.svngdo.shoppingcart.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    @ManyToOne
    @JoinColumn(name = "category_id", referencedColumnName = "id")
    private Category category;
    private int quantity;
    private double price;
    private double weight;
    private String description;
    private String imageName;
//    private String cart;
}
