package samplejavaproject2;

import java.util.*;

public class Exx13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String str = sc.next();
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += Character.toLowerCase(str.charAt(i));
        }
        System.out.println("Reversed string in lowercase: " + reversed);
    }
}

