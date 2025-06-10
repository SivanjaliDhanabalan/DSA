package day01;
public class MainDLL_Insert {
    public static void main(String[] args) {
        DLL_Insert list = new DLL_Insert();

        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);

        list.traverseForward();

        list.insertAtMiddle(25, 2); 

        list.traverseForward();
    }
}
