package org.anurag.test;

import org.anurag.Sl;
import org.junit.Assert;
import org.junit.Test;
import java.lang.reflect.Method;

public class Slt {
    @Test
    public void testPrivateMethod() throws Exception {
        Sl obj = new Sl();
        Method method = Sl.class.getDeclaredMethod("secretMultiply", int.class, int.class);
        method.setAccessible(true);
        int result = (int) method.invoke(obj, 5, 4);
        Assert.assertEquals(20, result);
    }
}
