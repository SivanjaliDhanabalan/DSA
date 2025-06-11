package day01;

public class CircularLinkedListMain {
    public static void main(String[] args) {
        CircularLinkedListOperations list = new CircularLinkedListOperations();
        list.insertAtTail(10);
        list.insertAtTail(20);
        list.insertAtTail(30);
        list.insertAtTail(40);
        list.deleteAtBeginning(10);
        list.display();
    }
}
