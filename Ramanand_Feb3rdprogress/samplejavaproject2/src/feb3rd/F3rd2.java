package feb3rd;

public class F3rd2 {

    public static void oddornot(int n1){
        if (n1 % 2 != 0) {
            throw new RuntimeException("The number is odd , Exception Raised");
        }
        System.out.println("The number is even " + n1);
    }

    public static void main(String[] args){
        try{
            oddornot(4);
        } catch (RuntimeException re){
            System.out.println(re);
        } 
    }
}
