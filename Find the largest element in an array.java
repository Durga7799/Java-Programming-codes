import java.util.Arrays;

public class PrintSortedArrayExample {
    public static void main(String[] args) {
        // Example array
        int[] arr = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5};
        Arrays.sort(arr);
         System.out.println(Arrays.toString(arr));
        System.out.println("The largest element is " + arr[arr.length-1]);
    }
}
