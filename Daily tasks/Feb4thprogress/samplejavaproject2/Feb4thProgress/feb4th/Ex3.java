package feb4th;
import java.util.List;
public class Ex3 {
    public static <T> int findFirstIndex(List<T> list,T target){
        for (int i=0;i<list.size();i++) {
            if(list.get(i).equals(target)) return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        List<String>words=List.of("yellow","red","black","blue");
        List<Integer>nums=List.of(11,99,52,67,10);
        System.out.println(findFirstIndex(words,"red"));
        System.out.println(findFirstIndex(words,"blue"));
        System.out.println(findFirstIndex(nums,1000));
        System.out.println(findFirstIndex(nums,52));
    }
}
