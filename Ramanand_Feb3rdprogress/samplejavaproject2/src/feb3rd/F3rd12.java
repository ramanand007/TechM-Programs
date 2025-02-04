package feb3rd;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class F3rd12 {
    public static void main(String[] args) {
        String path = "C:\\Users\\raman\\Documents\\testing.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading the file.");
        }
    }
}

