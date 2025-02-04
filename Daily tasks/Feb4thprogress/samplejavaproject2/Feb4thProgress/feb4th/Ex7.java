package feb4th;

import java.util.ArrayList;

public class Ex7{
    public static void main(String[] args){
        ArrayList<String> list = new ArrayList<>();
        list.add("Banana");
        list.add("Cherry");
        list.add("Date");
        list.add(0,"Apple");    
        for (String item : list) {
            System.out.println(item);
        }
    }
}

