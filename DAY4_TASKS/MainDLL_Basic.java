package day01;

public class MainDLL_Basic {
    public static void main(String[] args) {
        DLL_Basic list = new DLL_Basic();

        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);

        list.traverseForward();
        list.traverseBackward();
    }
}

