package feb6th;
import java.util.List;
import java.util.stream.Collectors;

public class StreamEx7  {
    public static void main(String[] args) {
        List<String> strings = List.of("bmw","Audi","Porsche","Benz","RolsRoyce");
        List<String> ascending = strings.stream().sorted().collect(Collectors.toList());
        List<String> descending = strings.stream().sorted((a, b) -> b.compareTo(a)).collect(Collectors.toList());
        System.out.println("Ascending: " + ascending);
        System.out.println("Descending: " + descending);
    }
}

