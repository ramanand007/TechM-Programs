package samplejavaproject2;
import java.util.*;

public class Exx12 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String str = sc.next();
        str = str.toLowerCase();
        char smallestVowel = 'z';
        boolean foundVowel = false;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                if (ch < smallestVowel) {
                    smallestVowel = ch;
                    foundVowel = true;
                }
            }
        }

        if (foundVowel) {
            System.out.println("The smallest vowel is: " + smallestVowel);
        } else {
            System.out.println("No vowels found.");
        }

    }
}
