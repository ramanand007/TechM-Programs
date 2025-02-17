package com.items.beans;

public class Item {
    private String itemName;
    private int quantity;
    private double price;

    // Getters & Setters
    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Item [Item Name=" + itemName + ", Quantity=" + quantity + ", Price=" + price + "]";
    }
}
