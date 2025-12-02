
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

public class Delete {

    static Node head;

    // DELETE AT START
    public static void deleteAtStart() {

        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        head = head.next;         // move head to next node

        if (head != null) {
            head.prev = null;     // remove backward link
        }
    }

    // DELETE AT END
    public static void deleteAtEnd() {

        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        if (head.next == null) {   // only one node
            head = null;
            return;
        }

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;    // reach last node
        }

        // temp is last node
        temp.prev.next = null;   // remove last node
    }

    // DELETE AT POSITION (0-based index)
    public static void deleteAtPosition(int pos) {

        if (head == null) {
            System.out.println("List empty");
            return;
        }

        if (pos == 0) {             // delete first node
            deleteAtStart();
            return;
        }

        Node temp = head;

        for (int i = 0; i < pos; i++) {
            if (temp == null) {
                System.out.println("Position out of range");
                return;
            }
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Position out of range");
            return;
        }

        // temp is the node to delete
        temp.prev.next = temp.next;

        if (temp.next != null) {
            temp.next.prev = temp.prev;
        }
    }

    // Print DLL
    public static void printDLL() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {

        // create DLL manually
        Node first = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        Node fourth = new Node(40);

        first.next = second;
        second.prev = first;

        second.next = third;
        third.prev = second;

        third.next = fourth;
        fourth.prev = third;

        head = first;

        System.out.println("Original DLL:");
        printDLL();

        deleteAtStart();
        System.out.println("\nAfter deleting start:");
        printDLL();

        deleteAtEnd();
        System.out.println("\nAfter deleting end:");
        printDLL();

        deleteAtPosition(1);
        System.out.println("\nAfter deleting position 1:");
        printDLL();
    }
}
