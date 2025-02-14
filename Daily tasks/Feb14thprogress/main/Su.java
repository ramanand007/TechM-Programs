package org.anurag;

public class Su {
    public static boolean isPalindrome(String str) {
        return str.equalsIgnoreCase(new StringBuilder(str).reverse().toString());
    }
}
