package com.amazon.entity;


import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@jakarta.persistence.Entity
@Table(name = "Product")
public class Entity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int productId;

    private String productName;
    private int productPrice;

   
    public int getProductId() {
        return productId;
    }

   
    public void setProductName(String productName) {
        this.productName = productName;
    }

    
    public void setProductPrice(int productPrice) {
        this.productPrice = productPrice;
    }


    public String getProductName() {
        return productName;
    }

   
    public int getProductPrice() {
        return productPrice;
    }
}