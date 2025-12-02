// insert a new node in begining

class Node {

    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Insertbegin {

    // Head of the linkedlist 
    static Node head;

    public static void insertAtStart(int value) {
        Node newNode = new Node(value); // create new node
        newNode.next = head;            // new node points to old head
        head = newNode;                 // update head to new node
    }

    //Insert at end
    public static void insertAtEnd(int value) {
        Node newNode = new Node(value);
        // if list is empty
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode; // insert at last 
    }

    //Insert at specific position
    public static void insertAtPosition(int value, int pos) {
        Node newNode = new Node(value);

        if (pos == 0) {
            newNode.next = head;
            head = newNode;
            return;
        }
        Node temp = head;

        for (int i = 0; i < pos - 1; i++) {
            if (temp == null) {
                System.out.println("Position out of range");
                return;
            }
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    //Delete at start node
    public static void deleteAtstart() {
        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        //  move head to next node
        head = head.next;
    }

    //Delete at last node
    public static void deleteAtend() {
        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
    }

    //Delete at specific position
    public static void deleteAtposition(int pos) {
        if (head == null) {
            System.out.println("list is empty");
            return;
        }

        if (pos == 0) {
            head = head.next;
            return;
        }
        Node temp = head;

        for (int i = 0; i < pos - 1; i++) {
            if (temp.next == null) {
                System.out.println("position out of range");
                return;
            }
            temp = temp.next;
        }
        if (temp.next == null) {
            System.out.println("Position out of range");
            return;
        }
        temp.next = temp.next.next;
    }

    public static void main(String[] args) {

        Node first = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);

        first.next = second;
        second.next = third;

        // Making first node as head
        head = first;

        // INSERTING NEW NODE AT START
        insertAtStart(5);  // Insert node with value 5 at starting
        insertAtEnd(40);
        insertAtPosition(15, 2);

        // DELETE OPERATIONS
        deleteAtstart();        // removes 5
        deleteAtend();           // removes 40
        deleteAtposition(1);     // removes 15

        // We create a temporary pointer temp to start from the first node
        Node temp = head;

        while (temp != null) {
            System.out.println(temp.data + " ->");
            temp = temp.next; // move to next node
        }

        System.out.println("null");

    }
}
