package feb3rd;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class F3rd11 {
    public static void main(String[] args) {
        String filePath="\\samplejavaproject2\\src\\feb3rd\\iy.dat";

        try(BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line=br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading the file.");
        }
    }
}

