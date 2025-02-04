package feb4th;

import java.util.ArrayList;

public class Ex9 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Porsche");
        list.add("Bmw");
        list.add("Masarati");
        list.add("Audi");

        String newElement = "Blaze";

        list.set(1, newElement);

        for (String item : list) {
            System.out.println(item);
        }
    }
}

