package feb4th;

import java.util.ArrayList;

public class Ex10 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Porsche");
        list.add("Bmw");
        list.add("Masarati");
        list.add("Audi");
        
        list.remove(2);
        
        for (String item : list) {
            System.out.println(item);
        }
    }
}

