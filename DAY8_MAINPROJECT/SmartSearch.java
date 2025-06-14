package day01;
import java.util.*;

public class SmartSearch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] intArr = { 10, 23, 45, 67, 89 };
        String[] strArr = { "apple", "banana", "cherry", "date" };

        System.out.print("Enter a value to search: ");
        String input = sc.nextLine();
        try {
            int intInput = Integer.parseInt(input);
            Arrays.sort(intArr);
            int index = Arrays.binarySearch(intArr, intInput);
            System.out.println(index >= 0 ? 
                "Integer found at index: " + index : 
                "Integer not found.");
        } catch (NumberFormatException e) {
            Arrays.sort(strArr);
            int index = Arrays.binarySearch(strArr, input);
            System.out.println(index >= 0 ? 
                "String found at index: " + index : 
                "String not found.");
        }sc.close();
    }
}
