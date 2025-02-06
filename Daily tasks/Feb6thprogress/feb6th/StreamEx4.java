package feb6th;
import java.util.List;
import java.util.stream.Collectors;

public class StreamEx4 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(11,11,22,34,11,40,78,78);
        List<Integer> uniqueNumbers=numbers.stream().distinct().collect(Collectors.toList());
        System.out.println(uniqueNumbers);
    }
}

