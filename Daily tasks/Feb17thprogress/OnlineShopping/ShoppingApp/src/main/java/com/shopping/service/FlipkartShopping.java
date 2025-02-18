package com.shopping.service;

public class FlipkartShopping implements Shopping {
    @Override
    public void purchase() {
        System.out.println("Purchasing items from Flipkart...");
    }
}
