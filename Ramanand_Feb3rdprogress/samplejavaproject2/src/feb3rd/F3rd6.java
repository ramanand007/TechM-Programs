package feb3rd;

import java.io.File;

public class F3rd6 {
    public static void main(String[] args){
        String directoryPath="\\samplejavaproject2";
        File directory=new File(directoryPath);

        if(directory.exists()&&directory.isDirectory()){
            String[] files=directory.list();

            if(files!=null){
                System.out.println("List of files and directories:");
                for(String fileName:files) {
                    System.out.println(fileName);
                }
            } else{
                System.out.println("The directory is empty.");
            }
        } else{
            System.out.println("The specified path is either not a directory or doesn't exist.");
        }
    }
}

