package feb3rd;

import java.io.*;

public class F3rd3{

    public static void readFile(String fileName) throws FileNotFoundException {
        File file = new File(fileName);
        if(!file.exists()) {
            throw new FileNotFoundException("File is not found: " + fileName);
        }
        System.out.println("File found: " + fileName);
    }

    public static void main(String[] args) {
        try {
            readFile("techmmm.txt");
        } catch (FileNotFoundException re) {
            System.out.println(re);
        }
    }
}

