package day01;

public class MainDLL2 {
    public static void main(String[] args) {
        DLL2 list = new DLL2();

        list.insert(100);
        list.insert(200);
        list.insert(300);
        list.insert(400);

        list.traverseForward();  
        list.traverseBackward(); 
    }
}
