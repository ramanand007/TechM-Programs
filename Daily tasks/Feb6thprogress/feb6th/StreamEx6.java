package feb6th;
import java.util.List;
import java.util.Optional;

public class StreamEx6 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(10,9999,5,9,999,67);
        Optional<Integer> max = numbers.stream().max(Integer::compareTo);
        Optional<Integer> min = numbers.stream().min(Integer::compareTo);
        max.ifPresent(value -> System.out.println("max: " + value));
        min.ifPresent(value -> System.out.println("min: " + value));
    }
}
