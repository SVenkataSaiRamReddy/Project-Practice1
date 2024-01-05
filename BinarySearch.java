public class BinarySearch {
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Checking if the target is at the middle
            if (arr[mid] == target) {
                return mid;
            }
            
            // If the target is greater, ignore left side
            if (arr[mid] < target) {
                left = mid + 1;
            } else {
                // If the target is smaller, ignore right side
                right = mid - 1;
            }
        }
        
        // If the element is not present in the array
        return -1;
    }

    public static void main(String[] args) {
        int[] sortedArray = { 2, 4, 6, 8, 1, 20 };
        int targetElement = 20;

        int resultIndex = binarySearch(sortedArray, targetElement);

        if (resultIndex != -1) {
            System.out.println("Element found at index: " + resultIndex);
        } else {
            System.out.println("Element not found in the array");
        }
    }
}
