package samplejavaproject2;
import java.util.*;
public class Exx7 {

    public static void main(String[] args) {

    }

    public static String capitalizeAlternate(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);

            if (i % 2 == 0) {
                result.append(Character.toUpperCase(currentChar));
            } else {
                result.append(Character.toLowerCase(currentChar));
            }
        }
        return result.toString();
    }
}

