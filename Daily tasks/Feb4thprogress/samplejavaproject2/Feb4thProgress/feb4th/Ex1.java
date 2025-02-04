package feb4th;

import java.util.Arrays;

public class Ex1{
    public static <T> boolean isEqual(T[]a1,T[]a2){
        return Arrays.equals(a1,a2);
    }
    public static void main(String[] args) {
        Integer[] x={1,2,3};
        Integer[] y={1,2,3};
        Integer[] z={3,2,1};
        System.out.println(isEqual(x,y));
        System.out.println(isEqual(x,z));
        String[] s1 = {"a","b","c"};
        String[] s2 = {"a","b","c"};
        String[] s3 = {"c","b","a"};

        System.out.println(isEqual(s1, s2));
        System.out.println(isEqual(s1, s3));
    }
}

