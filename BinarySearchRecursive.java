public class BinarySearchRecursive {
    public static void main(String[] args) {
        int arr[] = {2, 4, 7, 12, 15, 23, 28, 31, 46, 50};
        int target = 23;

        int index = binarySearchRecursive(arr, target, 0, arr.length - 1);
        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found");
        }
    }

    public static int binarySearchRecursive(int arr[], int target, int low, int high) {
        if (low > high) {
            return -1; // Target not found
        }

        int mid = low + (high - low) / 2;

        if (arr[mid] == target) {
            return mid; // Target found
        } else if (arr[mid] < target) {
            return binarySearchRecursive(arr, target, mid + 1, high); // Search right half
        } else {
            return binarySearchRecursive(arr, target, low, mid - 1); // Search left half
        }
    }
}
