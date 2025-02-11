package samplejavaproject2;

public class Exx4 {
    public static void main(String args[]) {
        int arr1[] = {10, 20, 30, 40, 50};
        int arr2[] = new int[(arr1.length + 1) / 2];
        int ind = 0;

        for (int i = 0; i < arr1.length; i += 2) {
            System.arraycopy(arr1, i, arr2, ind++, 1);
        }

        for (int value : arr2) {
            System.out.println(value);
        }
    }
}
