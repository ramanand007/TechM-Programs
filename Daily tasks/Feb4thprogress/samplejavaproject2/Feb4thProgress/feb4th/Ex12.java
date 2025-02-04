package feb4th;

import java.util.ArrayList;

public class Ex12 {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Porsche");
        list1.add("Bmw");
        list1.add("Masarati");
        list1.add("Audi");

        ArrayList<String> list2 = new ArrayList<>(list1);
        
        for (String item : list2) {
            System.out.println(item);
        }
    }
}

