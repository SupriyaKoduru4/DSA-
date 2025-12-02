
class Node {

    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;

    }
}

public class Searching {

    static Node head;

    // Create circular linked list 
    public static void createList() {
        Node first = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);

        first.next = second;
        second.next = third;
        third.next = first;  // circular

        head = first;
    }

    // Searching node
    public static boolean search(int key) {
        if (head == null) {
            return false;
        }

        Node temp = head;

        do {
            if (temp.data == key) {
                return true;
            }
            temp = temp.next;
        } while (temp != head);
        return false;
    }

    public static void main(String[] args) {

        createList();

        System.out.println("Search 20: " + search(20));
        System.out.println("Search 50: " + search(50));
    }
}
