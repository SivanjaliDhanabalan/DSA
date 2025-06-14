package day01;
public class RotatedArraySearch {
    public static int search(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (arr[left] <= arr[mid]) {
                if (target >= arr[left] && target < arr[mid]) {
                    right = mid - 1; 
                } else {
                    left = mid + 1; 
                }
            } else {
                if (target > arr[mid] && target <= arr[right]) {
                    left = mid + 1; 
                } else {
                    right = mid - 1; 
                }
            }
        }

        return -1; 
    }

    public static void main(String[] args) {
        int[] arr = { 4, 5, 6, 7, 0, 1, 2 };
        int target = 0;

        int index = search(arr, target);

        if (index != -1) {
            System.out.println("Target found at index: " + index);
        } else {
            System.out.println("Target not found.");
        }
    }
}

