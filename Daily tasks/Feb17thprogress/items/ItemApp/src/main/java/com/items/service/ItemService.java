package com.items.service;

import com.items.beans.Item;

public class ItemService {
    private Item item;

    // Setter Injection
    public void setItem(Item item) {
        this.item = item;
    }

    public void displayItem() {
        System.out.println(item);
    }
}
