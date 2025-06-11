package day01;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class CircularLinkedListOperations {
    Node last = null;

    public void insertAtTail(int num) {
        Node newNode = new Node(num);
        if (last == null) {
            newNode.next = newNode;
            last = newNode;
        } else {
            newNode.next = last.next;
            last.next = newNode;
            last = newNode; }
    }

    public void display() {
        if (last == null) return;
        Node temp = last.next;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != last.next);
        System.out.println();
    }
    
    public void deleteAtBeginning(int num) {
    	if(last==null)
    	{
    		System.out.println("Invalid");
    	}
    	if(last.next==last)
    	{
    		last=null;}
    		else {
    			last.next=last.next.next;
    		}
    	}
    }

