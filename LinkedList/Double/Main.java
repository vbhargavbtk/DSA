package Double;

public class Main {
    public static void main(String[] args) {
        LL list = new LL();
        list.insertFirst(10);
        list.insertFirst(20);
        list.insertEnd(30);
        list.display();
        System.out.println("\n" + list.size());
    }

}
