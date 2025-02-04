package feb4th;
import java.util.*;
public class Ex5 {
    public static <T> List<T> mergeAlternate(List<T> list1, List<T> list2) {
        List<T> merged = new ArrayList<>();
        int size1 = list1.size(), size2 = list2.size(), i = 0;
        while (i < size1 || i < size2) {
            if (i < size1) merged.add(list1.get(i));
            if (i < size2) merged.add(list2.get(i));
            i++;
        }
        return merged;
    }
    public static void main(String[] args) {
        List<String> list1 = List.of("a", "b", "c");
        List<String> list2 = List.of("1", "2", "3", "4");
        List<String> mergedList = mergeAlternate(list1, list2);
        System.out.println("Merged List: " + mergedList);
    }
}

