package org.anurag.test;

import org.anurag.Order;
import org.anurag.Payser;
import org.junit.Assert;
import org.junit.Test;

public class Intert {
    @Test
    public void testOrderAndPaymentIntegration() {
        Order order = new Order();
        Payser payment = new Payser();

        boolean orderPlaced = order.placeOrder("Laptop");
        boolean paymentProcessed = payment.processPayment(50000);

        Assert.assertTrue("Order should be placed", orderPlaced);
        Assert.assertTrue("Payment should be processed", paymentProcessed);
    }
}
