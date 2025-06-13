package day01;

public class StackOperation {
    private int[] stack;
    private int top;
    private int capacity;

    public StackOperation(int size) {
        capacity = size;
        stack = new int[capacity];
        top = -1; 
    }
   public void push(int element) {
        if (top == capacity - 1) {
            System.out.println("Stack Overflow");
            return;
        }
        stack[++top] = element;
        System.out.println(element + " pushed into stack");
    }
    public void pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return;
        }
        System.out.println("Popped: " + stack[top--]);
    }
    public void peek() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.println("Top element: " + stack[top]);
    }
    public boolean isEmpty() {
        return top == -1;
    }
    public void display() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.print("Stack elements: ");
        for (int i = 0; i <= top; i++) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }
}

