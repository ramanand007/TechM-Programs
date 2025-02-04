package feb4th;

import java.util.LinkedList;
import java.util.ListIterator;

public class Ex14 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Porsche");
        list.add("Bmw");
        list.add("Masarati");
        list.add("Audi");

        ListIterator<String> iterator = list.listIterator(list.size());

        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous());
        }
    }
}

