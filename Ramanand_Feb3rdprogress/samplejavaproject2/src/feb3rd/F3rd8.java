package feb3rd;

import java.io.File;

public class F3rd8{
    public static void main(String[] args) {
        String path="\\samplejavaproject2\\src\\feb3rd";
        File file=new File(path);

        if (file.exists()) {
            System.out.println("Read permission: " + file.canRead());
            System.out.println("Write permission: " + file.canWrite());
        } else {
            System.out.println("No path exist");
        }
    }
}

