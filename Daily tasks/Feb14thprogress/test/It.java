package org.anurag.test;

import org.junit.Ignore;
import org.junit.Test;

public class It {
    @Ignore("Feature under development")
    @Test
    public void testIncompleteFeature() {
        System.out.println("This test is ignored.");
    }
}

