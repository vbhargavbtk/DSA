package Single;

public class Main {
    public static void main(String[] args) {
        LL list = new LL();
        list.insertFirst(10);
        list.insertLast(20);
        list.insertLast(30);
        list.display();
        list.insertAtIndex(20, 1);
        list.display();
        list.deleteFirst();
        list.deleteLast();
        list.display();


    }
}
