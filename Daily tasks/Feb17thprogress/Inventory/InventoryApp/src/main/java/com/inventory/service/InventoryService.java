package com.inventory.service;

import com.inventory.beans.Inventory;

public class InventoryService {
    private Inventory inventory;

    // Constructor Injection
    public InventoryService(Inventory inventory) {
        this.inventory = inventory;
    }

    public void displayInventory() {
        System.out.println(inventory);
    }
}
