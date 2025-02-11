package samplejavaproject2;

import java.util.Arrays;

public class Exx6 {
    public static void main(String[] args) {
        int[] originalArray={10, 20, 30, 40, 50, 60, 70, 80, 90};
        int[] copiedArray=new int[5];
        System.arraycopy(originalArray,2,copiedArray,0,5); 
        System.out.println(Arrays.toString(copiedArray));
    }
}

