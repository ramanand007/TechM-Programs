package feb6th;
import java.util.List;

public class StreamEx5 {
    public static void main(String[] args) {
        List<String> strings = List.of("car","bike","aeroplane", "aircraft", "arek");
        long count = strings.stream().filter(s->s.startsWith("a")).count();
        System.out.println("Count is " + count);
    }
}
