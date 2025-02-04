package feb3rd;

import java.io.File;

public class F3rd7{
    public static void main(String[] args){
        String dirPath="\\samplejavaproject2\\src\\feb3rd";
        String ext=".java";
        File dir = new File(dirPath);

        if (dir.exists()&&dir.isDirectory()){
            String[] files=dir.list((d,name)->name.endsWith(ext));

            if (files!=null){
                for (String file:files) {
                    System.out.println(file);
                }
            } else {
                System.out.println("No Files");
            }
        } else {
            System.out.println("Invalid directory path.");
        }
    }
}

