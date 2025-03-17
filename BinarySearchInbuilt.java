import java.util.Arrays;

public class BinarySearchInbuilt {
    public static void main(String[] args) {
        int arr[] = {2, 4, 7, 12, 15, 23, 28, 31, 46, 50};
        int target = 23;

        int index = Arrays.binarySearch(arr, target);
        if (index >= 0) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found");
        }
    }
}
