package com.shopping.service;

public class OnlineShoppingService {
    private Shopping shopping;

    // Setter for Interface Injection
    public void setShopping(Shopping shopping) {
        this.shopping = shopping;
    }

    public void performPurchase() {
        shopping.purchase();
    }
}
