package org.anurag.test;

import org.anurag.Mo;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class Mot {
    private final int input;
    private final int expected;
    private final Mo mathOps = new Mo();

    public Mot(int input, int expected) {
        this.input = input;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
            {2, 4}, {3, 9}, {4, 16}, {5, 25}
        });
    }

    @Test
    public void testSquare() {
        Assert.assertEquals(expected, mathOps.square(input));
    }
}

