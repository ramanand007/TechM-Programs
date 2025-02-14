package org.anurag;

public class Order {
    public boolean placeOrder(String item) {
        return item != null && !item.isEmpty();
    }
}
