package day01;

import java.util.Scanner;

public class MainDLL {
    public static void main(String[] args) {
        DLL1 list = new DLL1();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Insert a node");
            System.out.println("2. Delete a node from middle");
            System.out.println("3. Traverse forward");
            System.out.println("4. Traverse backward");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter data to insert: ");
                    int data = scanner.nextInt();
                    list.insert(data);
                    break;
                case 2:
                    System.out.print("Enter position to delete: ");
                    int position = scanner.nextInt();
                    list.deleteAtMiddle(position);
                    break;
                case 3:
                    list.traverseForward();
                    break;
                case 4:
                    list.traverseBackward();
                    break;
                case 5:
                    System.out.println("Exiting..");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
