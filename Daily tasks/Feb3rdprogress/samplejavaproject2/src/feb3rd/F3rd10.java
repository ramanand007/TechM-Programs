package feb3rd;

import java.io.File;

public class F3rd10{
    public static void main(String[] args) {
        String path="\\samplejavaproject2\\src\\feb3rd";
        File file=new File(path);

        if(file.exists()){
            long lastModified = file.lastModified();
            System.out.println("Was last modified date: " + new java.util.Date(lastModified));
        } 
    }
}

