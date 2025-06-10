package day01;
public class Main {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();

        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.insert(50);

        System.out.println("Original List:");
        list.display();

        list.deleteMiddle();

        System.out.println("After Deleting Middle Node:");
        list.display();
    }
}



