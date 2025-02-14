
package org.anurag.test;

import org.anurag.Sin;
import org.junit.Assert;
import org.junit.Test;

public class Sint {
    @Test
    public void testSingletonInstance() {
        Sin s1 = Sin.getInstance();
        Sin s2 = Sin.getInstance();
        Assert.assertSame("Instances should be the same", s1, s2);
    }
}
