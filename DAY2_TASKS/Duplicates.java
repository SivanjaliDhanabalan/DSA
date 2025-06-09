package day01;
import java.util.Arrays;

public class Duplicates {
	public static void main(String[] args) {
	        int[] arr = {4, 2, 4, 5, 2, 3, 1, 3};
	        Arrays.sort(arr);
	        int n = arr.length;
	        int[] temp = new int[n];
	        int j = 0; 
	        for (int i = 0; i < n; i++) {
	            if (i == 0 || arr[i] != arr[i - 1]) {
	                temp[j] = arr[i];
	                j++;
	            }
	        }
	        System.out.print("Descending order: ");
	        for (int i = j - 1; i >= 0; i--) {
	            System.out.print(temp[i] + " ");
	        }
	    }
	}




