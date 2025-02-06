package feb6th;
import java.util.List;

public class StreamEx3 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,2,3,4,5,6);
        int evenSum=numbers.stream().filter(n->n%2==0).mapToInt(Integer::intValue).sum();
        int oddSum=numbers.stream().filter(n->n%2!=0).mapToInt(Integer::intValue).sum();
        System.out.println("Even Sum: " + evenSum);
        System.out.println("Odd Sum: " + oddSum);
    }
}

