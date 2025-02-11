package samplejavaproject2;
import java.util.*;

public class Exx15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String str = sc.nextLine();
        int spaces = 0, chars = 0;
        for (char c : str.toCharArray()) {
            if (c == ' ') spaces++;
            else if (Character.isLetter(c)) chars++;
        }
        System.out.println("Spaces: " + spaces);

        System.out.println("Characters: " + chars);
    }
}

