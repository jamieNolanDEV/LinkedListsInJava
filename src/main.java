import java.util.LinkedList;

public class main {
    public static void main(String[] args) {
        linkedlist list = new linkedlist();
        list.addFront(5);
        list.addFront(2);
        list.addFront(6);
        list.addFront(423);
        list.deleteValue(2);
        list.deleteValue(5);
        list.printList();

    }
}
