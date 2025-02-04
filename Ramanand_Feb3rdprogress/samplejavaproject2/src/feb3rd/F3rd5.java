package feb3rd;

import java.io.*;

public class F3rd5 {

    public static void fileemptyornot(String fileName) throws FileNotFoundException, IOException {
        File file = new File(fileName);

        if (file.length() == 0) {
            throw new IOException("File is empty: " + fileName);
        }
        System.out.println("Not empty");
    }

    public static void main(String[] args) {
        try {
        	fileemptyornot("C:\\Users\\raman\\Documents\\testing.txt");
        } catch (IOException re) {
            System.out.println(re);
        }

    }
}

