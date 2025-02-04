package feb3rd;

import java.io.File;

public class F3rd9{
    public static void main(String[] args) {
        String path="\\samplejavaproject2\\src";
        File file = new File(path);

        if(file.exists()){
            if(file.isDirectory()){
                System.out.println("Directory");
            } else if (file.isFile()){
                System.out.println("File");
            }
        } else {
            System.out.println("The path does not exist.");
        }
    }
}

