public class linkedlist {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }
   private int size;

    private Node head;

    public void addFront(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
        size++; // Better method to keep track of size!
    }


    public int getFirst() { //O(1)! Fast!
        if (head == null) {
            System.out.println("List is empty");
        }
        // if head is null blah blah
        return head.data;

    }

    public int getLast() {
        if (head == null) {
            System.out.println("emptyList");
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }

        return current.data;

    }

    public void doesItExist(int data) {
        Node searchNode = new Node(data);
        if (head == null) {
            System.out.println("List is empty");

        }
        Node current = head;
        while (current.next.data != searchNode.data) {
            current = current.next; // This is 0(n)!
            System.out.println("Looking.....");
        }
        System.out.println("Found! " +current.next.data);
    }

    public void addBack(int data){
        Node newNode = new Node(data);
        if(head == null){
            System.out.println("Emptylist!");
        }
        Node current = head;
        while(current.next != null){
            current = current.next;
        }
        current.next = newNode;



    }
    public void printList() {

        if (head == null) {
            System.out.println("List is empty");
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
            System.out.println(current.data);
        }
    }

    public int sizeList(){ // Brute force method, loops through not efficient but good to know for getting basics down.
        int count =0;
        if(head == null){
            System.out.println("empty!");
        }
        Node current = head;
        while(current.next != null){
            current = current.next;
            count++;
        }
        System.out.println("Count is : " +count);
        return count;
    }

    public void clearList(){
        head = null;
        //This is all, other nodes get dereferenced and garbage collection will clear them!
    }

    public void deleteValue(int data){
        Node searchNode = new Node(data);

    }
}
