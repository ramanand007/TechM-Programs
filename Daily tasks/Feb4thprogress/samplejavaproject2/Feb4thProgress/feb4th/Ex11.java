package feb4th;

import java.util.ArrayList;
import java.util.Collections;

public class Ex11 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(55);
        list.add(1);
        list.add(27);
        list.add(81);    
        Collections.sort(list); 
        for (Integer item : list) {
            System.out.println(item);
        }
    }
}

