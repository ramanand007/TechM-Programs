package org.anurag.test;

import org.anurag.Dc;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Dct {
    private Dc db;

    @Before
    public void setUp() {
        db = new Dc();
        db.connect();
    }

    @After
    public void tearDown() {
        db.disconnect();
    }

    @Test
    public void testFetchData() {
        Assert.assertEquals(100, db.fetchData());
    }
}
