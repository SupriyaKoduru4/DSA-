// insert a number in start and end 

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

public class Insert {

    static Node head;  // DLL head

    // INSERT AT START
    public static void insertAtStart(int value) {
        Node newNode = new Node(value);

        if (head == null) {   // if list empty
            head = newNode;
            return;
        }

        newNode.next = head;  // new node → old head
        head.prev = newNode;  // old head → back to new node
        head = newNode;       // update head
    }

    // INSERT AT END
    public static void insertAtEnd(int value) {
        Node newNode = new Node(value);

        if (head == null) {   // empty list
            head = newNode;
            return;
        }

        Node temp = head;

        while (temp.next != null) {  // go to last node
            temp = temp.next;
        }

        temp.next = newNode;   // last node → new node
        newNode.prev = temp;   // new node → previous node
    }

    // PRINT DLL
    public static void printDLL() {
        Node temp = head;
        System.out.println("Doubly Linked List:");

        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {

        insertAtStart(20);
        insertAtStart(10);

        insertAtEnd(30);
        insertAtEnd(40);

        printDLL();
    }
}
