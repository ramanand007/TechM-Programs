package com.shopping.service;

public class AmazonShopping implements Shopping {
    @Override
    public void purchase() {
        System.out.println("Purchasing items from Amazon...");
    }
}
