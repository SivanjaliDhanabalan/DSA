package day01;
public class FrequencyCount {
    public static int findFirst(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        int result = -1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (arr[mid] == target) {
                result = mid;
                right = mid - 1; 
            } else if (target < arr[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return result;
    }
    public static int findLast(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        int result = -1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (arr[mid] == target) {
                result = mid;
                left = mid + 1; 
            } else if (target < arr[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return result;
    }
    public static int countFrequency(int[] arr, int target) {
        int first = findFirst(arr, target);
        if (first == -1) return 0; 
        int last = findLast(arr, target);
        return last - first + 1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 2, 3, 4, 5, 5, 5, 5, 6};
        int target = 5;

        int frequency = countFrequency(arr, target);
        System.out.println("Frequency of " + target + " is: " + frequency);
    }
}

