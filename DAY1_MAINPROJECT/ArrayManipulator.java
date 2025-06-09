package day01;
import java.util.ArrayList;
import java.util.Scanner;

	public class ArrayManipulator {

	    public static void display(ArrayList<String> arr) {
	        if (arr.isEmpty()) {
	            System.out.println("Array is empty.");
	        } else {
	            System.out.println("Array elements: " + arr);
	        }
	    }

	    public static void insert(ArrayList<String> arr, Scanner sc) {
	        System.out.print("Enter element to insert: ");
	        String element = sc.nextLine();
	        arr.add(element);
	        System.out.println(element + " inserted.");
	    }

	    public static void delete(ArrayList<String> arr, Scanner sc) {
	        if (arr.isEmpty()) {
	            System.out.println("Array is empty. Nothing to delete.");
	            return;
	        }
	        System.out.print("Enter element to delete: ");
	        String element = sc.nextLine();
	        if (arr.remove(element)) {
	            System.out.println(element + " deleted.");
	        } else {
	            System.out.println(element + " not found in array.");
	        }
	    }

	    public static void search(ArrayList<String> arr, Scanner sc) {
	        System.out.print("Enter element to search: ");
	        String element = sc.nextLine();
	        int index = arr.indexOf(element);
	        if (index != -1) {
	            System.out.println(element + " found at index " + index + ".");
	        } else {
	            System.out.println(element + " not found in array.");
	        }
	    }

	    public static void main(String[] args) {
	        ArrayList<String> arr = new ArrayList<>();
	        Scanner sc = new Scanner(System.in);

	        while (true) {
	            System.out.println("\nMenu:");
	            System.out.println("1. Display Array");
	            System.out.println("2. Insert Element");
	            System.out.println("3. Delete Element");
	            System.out.println("4. Search Element");
	            System.out.println("5. Exit");
	            System.out.print("Enter your choice (1-5): ");

	            String choice = sc.nextLine();

	            switch (choice) {
	                case "1":
	                    display(arr);
	                    break;
	                case "2":
	                    insert(arr, sc);
	                    break;
	                case "3":
	                    delete(arr, sc);
	                    break;
	                case "4":
	                    search(arr, sc);
	                    break;
	                case "5":
	                    System.out.println("Exiting program.");
	                    sc.close();
	                    System.exit(0);
	                default:
	                    System.out.println("Invalid choice. Please try again.");
	            }
	        }
	    }
	}



