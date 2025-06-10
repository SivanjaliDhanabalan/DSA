package day01;

public class DLL2 {
    class Node4 {
        int data;
        Node4 prev, next;

        Node4(int data) {
            this.data = data;
            this.prev = this.next = null;
        }
    }
    Node4 head;
    public void insert(int data) {
        Node4 newNode = new Node4(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node4 temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.prev = temp;
    }
    public void traverseForward() {
        Node4 temp = head;
        System.out.print("Forward traversal: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public void traverseBackward() {
        if (head == null) return;
        Node4 temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        System.out.print("Backward traversal: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.prev;
        }
        System.out.println();
    }
}
