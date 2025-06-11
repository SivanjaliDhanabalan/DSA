package day01;
import java.util.Scanner;

public class CLLMainMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CLLMenu list = new CLLMenu();
        int choice, value, position;
        do {
            System.out.println("Circular Linked List Operations:");
            System.out.println("1. Insert at Tail");
            System.out.println("2. Delete from Head");
            System.out.println("3. Delete at Position");
            System.out.println("4. Display");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to insert: ");
                    value = sc.nextInt();
                    list.insertAtTail(value);
                    break;
                case 2:
                    list.deleteFromHead();
                    System.out.println("Head node deleted.");
                    break;
                case 3:
                    System.out.print("Enter position to delete: ");
                    position = sc.nextInt();
                    list.deleteAtPosition(position);
                    System.out.println("Node deleted at position " + position);
                    break;
                case 4:
                    System.out.println("Circular Linked List:");
                    list.display();
                    break;
                case 5:
                    System.out.println("Exiting program..");
                    break;
                default:
                    System.out.println("Invalid");
            }
        } while (choice != 5);
        sc.close();
    }
}

