package day01;

public class CLLMain {
    public static void main(String[] args) {
        CLL list = new CLL();
        list.insertAtTail(1);
        list.insertAtTail(2);
        list.insertAtTail(3);
        list.insertAtTail(4);
        list.display();
        System.out.println("Deleting node at position 2:");
        list.deleteAtPosition(2);
        list.display();
        System.out.println("Deleting head node:");
        list.deleteAtPosition(1);
        list.display();
        System.out.println("Deleting last node:");
        list.deleteAtPosition(3);
        list.display();
    }
}
