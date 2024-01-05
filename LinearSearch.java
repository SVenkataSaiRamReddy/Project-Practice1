public class LinearSearch {
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // Element found at index i
            }
        }
        return -1; // Element not found in the array
    }

    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 5, 6, 7, 4 };
        int targetElement = 7;
        int resultIndex = linearSearch(array, targetElement);

        if (resultIndex != -1) {
            System.out.println("Element found at index: " + resultIndex);
        } else {
            System.out.println("Element not found in the array");
        }
    }
}
