public class BinarySearchIterative {
    public static void main(String[] args) {
        int arr[] = {2, 4, 7, 12, 15, 23, 28, 31, 46, 50};
        int target = 23;

        int index = binarySearchIterative(arr, target);
        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found");
        }
    }

    public static int binarySearchIterative(int arr[], int target) {
        int low = 0, high = arr.length - 1;
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            
            if (arr[mid] == target) {
                return mid; // Target found
            } else if (arr[mid] < target) {
                low = mid + 1; // Search right half
            } else {
                high = mid - 1; // Search left half
            }
        }
        return -1; // Target not found
    }
}
