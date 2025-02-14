package org.anurag.test;

import org.anurag.Su;
import org.junit.Assert;
import org.junit.Test;

public class Sut {
    @Test
    public void testPalindrome() {
        Assert.assertTrue("Expected 'madam' to be a palindrome", Su.isPalindrome("madam"));
        Assert.assertFalse("Expected 'hello' to NOT be a palindrome", Su.isPalindrome("hello"));
    }
}
