// This create a new class called node.A linkedlist consists of multiple nodes.

class Node {

    // this int variable stores the value inside the node
    int data;
    //This stores the address/link to the next node in the linked list
    Node next;

    //Assign the given value to the node
    Node(int data) {
        //Assign the given value to the node
        this.data = data;
        //When a node is created, it does not point to any other node
        this.next = null;
    }
}

public class Singlelinkedlist {

    public static void main(String[] args) {

        //Creates the node with values.
        Node first = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);

        //first node points to second node
        first.next = second;
        //second node points to third node
        second.next = third;

        //We create a temporary pointer temp to start from the first node
        Node temp = first;
        //Loop until we reach the end (null)
        while (temp != null) {
            System.out.println(temp.data + " ->");
            //Move temp to the next node.
            temp = temp.next;
        }
        System.out.println("null");
    }
}
