package day01;
import java.util.Scanner;
public class CLLMenu {
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
    Node last = null;

    public void insertAtTail(int num) {
        Node newNode = new Node(num);
        if (last == null) {
            newNode.next = newNode;
            last = newNode;
        } else {
            newNode.next = last.next;
            last.next = newNode;
            last = newNode;
        }
    }

    public void deleteFromHead() {
        if (last == null) return;
        if (last.next == last) {
            last = null;
            return;
        }
        last.next = last.next.next;
    }

    public void deleteAtPosition(int position) {
        if (last == null) return;
        Node temp = last.next;

        if (position == 1) {
            deleteFromHead();
            return;
        }

        Node prev = null;
        int count = 1;
        do {
            prev = temp;
            temp = temp.next;
            count++;
        } while (count < position && temp != last.next);

        if (count == position) {
            prev.next = temp.next;
            if (temp == last) {
                last = prev;
            }
        }
    }

    public void display() {
        if (last == null) {
            System.out.println("List is empty.");
            return;
        }
        Node temp = last.next;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != last.next);
        System.out.println();
    }
}
