// insert node at start, end and forward, backward

class Node {

    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

public class Insertnode {

    // Take a static node
    static Node head;

//Insert node at start 
    public static void insertAtstart(int value) {

        //Create a new node with given value.
        Node newNode = new Node(value);

        // check the list is empty or not If list is empty.
        if (head == null) {
            // next → itself
            newNode.next = newNode;
            // prev → itself
            newNode.prev = newNode;
            // head = newNode
            head = newNode;
            return;
        }

        //last points to the current last node
        Node last = head.prev;

        newNode.next = head;
        newNode.prev = last;

        last.next = newNode;
        head.prev = newNode;

        head = newNode;

    }

    //Insert at end
    public static void insertAtend(int value) {
        Node newNode = new Node(value);

        if (head == null) {
            newNode.next = newNode;
            newNode.prev = newNode;
            head = newNode;
            return;
        }
        Node last = head.prev;

        last.next = newNode;
        newNode.prev = last;

        newNode.next = head;
        head.prev = newNode;
    }

    //print forward
    public static void printForward() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node temp = head;
        System.out.println("Fprward : ");

        do {
            System.out.println(temp.data + " <-> ");
            temp = temp.next;
        } while (temp != head);
        System.out.println("head");
    }

    //print backward
    public static void printBackward() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node temp = head.prev;
        System.out.println("Backward : ");

        do {
            System.out.println(temp.data + " <-> ");
            temp = temp.prev;
        } while (temp != head.prev);
        System.out.println("head");
    }

    public static void main(String[] args) {

        insertAtstart(20);
        insertAtstart(10);

        insertAtend(30);
        insertAtend(40);

        printForward();
        printBackward();
    }

}
