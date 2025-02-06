package feb6th;

import java.util.List;

public class StreamEx2  {
    public static void main(String[] args) {
        List<String> strings = List.of("Hi","hello","RaMaNaNd");
        strings.stream().map(String::toUpperCase).forEach(System.out::println);
    }
}


