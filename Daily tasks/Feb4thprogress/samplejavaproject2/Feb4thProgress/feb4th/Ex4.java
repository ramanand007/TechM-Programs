package feb4th;
import java.util.*;

public class Ex4{
    public static <T> List<T> reverseList(List<T> list) {
        List<T> reversed=new ArrayList<>(list);
        Collections.reverse(reversed);
        return reversed;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements:");
        int n = sc.nextInt();
        sc.nextLine();

        List<String> elements = new ArrayList<>();
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            elements.add(sc.nextLine());
        }
        System.out.println("After reverse: " + reverseList(elements));

    }
}
