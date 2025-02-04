package feb4th;

import java.util.ArrayList;

public class Ex8 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Porsche");
        list.add("Bmw");
        list.add("Masarati");
        list.add("Audi");
        
        String element = list.get(3);
        
        System.out.println("Element at given index is " +element);
    }
}

