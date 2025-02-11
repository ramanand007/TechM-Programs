package samplejavaproject2;
import java.util.Arrays;
public class Exx5 {
    public static void main(String[] args){
        int[] simpleArray1={1, 2, 3};
        int[] simpleArray2={1, 2, 3};

        int[][]nestedArray1={{1, 2}, {3, 4}};
        int[][]nestedArray2={{1, 2}, {3, 4}};
        System.out.println(Arrays.equals(simpleArray1,simpleArray2));
        System.out.println(Arrays.equals(nestedArray1,nestedArray2));
        System.out.println(Arrays.deepEquals(nestedArray1,nestedArray2));
    }
}
