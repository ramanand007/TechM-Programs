package feb3rd;

public class F3rd1 {
    public static void main(String[] args) {
        try {
            int n1=55/0;
        } catch (ArithmeticException e) {
            System.out.println("Zero division error");
        }

    }
}
