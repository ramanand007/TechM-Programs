package feb3rd;

import java.io.*;
import java.util.Scanner;
public class F3rd4 {

    public static void checkNumbersInFile(String fileName) throws Exception {
        File file = new File(fileName);
		Scanner sc = new Scanner(file);
        
        while (sc.hasNextInt()) {
            int number=sc.nextInt();
            if (number>0) {
                throw new Exception("Found a positive number");
            }
        }
    }

    public static void main(String[] args) {
        String fileName = "\\samplejavaproject2\\src\\feb3rd\\op.dat"; 
        
        try {
            checkNumbersInFile(fileName); 
            System.out.println("No positive numbers found.");
        } catch (Exception re) {
            System.out.println("Exception: " + re);
        }
    }
}
