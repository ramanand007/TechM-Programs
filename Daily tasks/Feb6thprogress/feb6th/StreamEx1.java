package feb6th;

import java.util.List;

public class StreamEx1 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(10,20,30,40,50);
        double average = numbers.stream().mapToInt(Integer::intValue).average().orElse(0.0);
        System.out.println("Average is : " + average);
    }
}

