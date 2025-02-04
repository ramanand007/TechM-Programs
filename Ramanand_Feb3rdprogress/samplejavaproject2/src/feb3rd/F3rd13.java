package feb3rd;

import java.io.File;

public class F3rd13 {
    public static void main(String[] args) {
        String path = "C:\\Users\\raman\\Documents\\testing.txt";
        File file = new File(path);

        if (file.exists()) {
            long bytes = file.length();
            System.out.printf("File size: %d Bytes, %.2f KB, %.2f MB%n", bytes, bytes / 1024.0, bytes / (1024.0 * 1024.0));
        } else {
            System.out.println("File does not exist.");
        }
    }
}

