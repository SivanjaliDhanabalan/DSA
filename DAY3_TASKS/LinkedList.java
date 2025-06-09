package day01;
class Node{
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
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertAtPosition(10, 0);
        list.insertAtPosition(20, 1);
        list.insertAtPosition(30, 2);
        list.insertAtPosition(15, 1); 
        list.printList();
    }
}
