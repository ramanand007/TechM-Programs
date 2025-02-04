package feb4th;

import java.util.LinkedList;

public class Ex15 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        
        list.add("Goku");
        list.add("Naruto");
        
        list.addFirst("Eren yeager");  
        list.addLast("Isagi");    
        
        for (String item : list) {
            System.out.println(item);
        }
    }
}

