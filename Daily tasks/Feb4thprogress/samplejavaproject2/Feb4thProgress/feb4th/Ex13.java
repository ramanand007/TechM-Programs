package feb4th;
import java.util.LinkedList;

public class Ex13 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Porsche");
        list.add("Bmw");
        list.add("Masarati");
        list.add("Audi"); 

        for (String item : list) {
            System.out.println(item);
        }
    }
}

