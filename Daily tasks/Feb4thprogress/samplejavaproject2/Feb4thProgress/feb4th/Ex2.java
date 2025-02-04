package feb4th;
import java.util.List;
public class Ex2 {
    public static <T extends Number> void gg(List<T> nums) {
        double esum=0;
        double osum=0;
        for (T n : nums){
            if (n.doubleValue()%2==0) esum+=n.doubleValue();
            else osum += n.doubleValue();
        }
        System.out.println("Even sum: "+esum);
        System.out.println("Odd sum: "+osum);
    }
    public static void main(String[] args) {
        List<Integer>nums1=List.of(1,2,3,4,5,6); 
        gg(nums1);
      
    }
}

