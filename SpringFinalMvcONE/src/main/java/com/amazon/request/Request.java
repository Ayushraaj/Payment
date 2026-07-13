package com.amazon.request;

public class Request {

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
