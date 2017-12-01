package com.weebly.sarikcyber.recyclerviewdemo;

/**
 * Created by dustu on 12/2/2017.
 */

public class Product {

    private String productTitle;
    private double productRating;
    private double productPrice;
    private int productImage;


    public Product(String productTitle, double productRating, double productPrice, int productImage) {
        this.productTitle = productTitle;
        this.productRating = productRating;
        this.productPrice = productPrice;
        this.productImage = productImage;
    }

    public String getProductTitle() {
        return productTitle;
    }

    public double getProductRating() {
        return productRating;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public int getProductImage() {
        return productImage;
    }
}
