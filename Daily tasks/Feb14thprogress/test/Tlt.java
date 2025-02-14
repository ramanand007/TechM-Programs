package org.anurag.test;

import org.junit.Test;

public class Tlt {
    @Test(timeout = 1000)
    public void testTimeConsumingMethod() {
        try {
            Thread.sleep(900);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

