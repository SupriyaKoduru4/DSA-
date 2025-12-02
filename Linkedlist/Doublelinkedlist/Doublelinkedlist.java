// DLL Node structure

//Creates a class named Node
class Node {
    // value inside node.data stores the value inside the node

    int data;
    //Pointer that stores the address of the next node.
    Node next;
    // points to previous node   
    Node prev;

    //This is the constructor.Assign the value to the node
    Node(int data) {
        this.data = data;
        //next and prev are null because the node is not connected yet.
        this.next = null;
        this.prev = null;
    }
}

//This is the main class where we create and print the DLL.
public class Doublelinkedlist {

    //Main method → the program starts executing here.
    public static void main(String[] args) {

        //We created 3 nodes with values.Right now they are NOT linked.
        Node first = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);

        // Linking nodes forward (next pointers)
        first.next = second;
        second.next = third;

        // Linking nodes backward (prev pointers)
        second.prev = first;
        third.prev = second;

        // head points to the first node
        Node head = first;

        //head points to the first node
        Node temp = head;
        System.out.println("Doubly Linked List (Forward):");
        //Loop until we reach null
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("null");

        // Printing DLL backward
        Node last = third;  // last node
        System.out.println("Doubly Linked List (Backward):");
        while (last != null) {
            System.out.print(last.data + " <-> ");
            last = last.prev;
        }
        System.out.println("null");
    }
}
