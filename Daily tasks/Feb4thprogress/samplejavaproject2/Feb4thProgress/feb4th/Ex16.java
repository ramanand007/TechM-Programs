package feb4th;

import java.util.LinkedList;
import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        LinkedList<String> list = new LinkedList<>();
        
        System.out.println("Enter the number of elements in the linked list:");
        int n = sc.nextInt();
        sc.nextLine();
        
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            list.add(sc.nextLine());
        }
        
        System.out.println("Enter the element to found");
        String element = sc.nextLine();
        
        int firstIndex = list.indexOf(element);
        int lastIndex = list.lastIndexOf(element); 
        
        if (firstIndex == -1) {
            System.out.println("The element '" + element + "' is not present in the list.");
        } else {
            System.out.println("First occurrence of '" + element + "' is at index: " + firstIndex);
            System.out.println("Last occurrence of '" + element + "' is at index: " + lastIndex);
        }

        sc.close();
    }
}

