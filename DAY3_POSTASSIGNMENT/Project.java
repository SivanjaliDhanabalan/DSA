package day01;
import java.util.Scanner;

class Node {
    int data;
    Node next;
    
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;
    public void insertAtPosition(int data, int position) {
        Node newNode = new Node(data);

        if (position == 0) {
            newNode.next = head;
            head = newNode;
            return;
        }

        Node temp = head;
        int count = 0;

        while (temp != null && count < position - 1) {
            temp = temp.next;
            count++;
        }

        if (temp != null) {
            newNode.next = temp.next;
            temp.next = newNode;
        } else {
            System.out.println("Invalid position.");
        }
    }
    public void deleteAtPosition(int position) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        if (position == 0) { 
            head = head.next;
            return;
        }

        Node temp = head;
        int count = 0;

        while (temp != null && count < position - 1) {
            temp = temp.next;
            count++;
        }

        if (temp != null && temp.next != null) {
            temp.next = temp.next.next;
        } else {
            System.out.println("Invalid position.");
        }
    }
    public void displayList() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}

public class Project {  
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        Scanner sc = new Scanner(System.in);
        int choice, data, position;

        while (true) {
            System.out.println("\nMENU:");
            System.out.println("1. Insert at position");
            System.out.println("2. Delete at position");
            System.out.println("3. Display list");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter data to insert: ");
                    data = sc.nextInt();
                    System.out.print("Enter position: ");
                    position = sc.nextInt();
                    list.insertAtPosition(data, position);
                    break;

                case 2:
                    System.out.print("Enter position to delete: ");
                    position = sc.nextInt();
                    list.deleteAtPosition(position);
                    break;

                case 3:
                    list.displayList();
                    break;

                case 4:
                    System.out.println("Exiting program...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}

