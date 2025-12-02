// delete at start and end and position

class Node {
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class Delete {

    static Node head;

    // Create a basic circular linked list
    public static void createList(){
        Node first = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        Node fourth = new Node(40);

        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = first; // circular

        head = first;
    }

    // DELETE AT START
    public static void deleteAtStart(){
        if(head == null){
            System.out.println("List is empty!");
            return;
        }

        // only one node
        if(head.next == head){
            head = null;
            return;
        }

        Node last = head;
        while(last.next != head){
            last = last.next;
        }

        head = head.next;     // move head
        last.next = head;     // keep circle intact
    }

    // DELETE AT END
    public static void deleteAtEnd(){
        if(head == null){
            System.out.println("List is empty!");
            return;
        }

        // only one node
        if(head.next == head){
            head = null;
            return;
        }

        Node temp = head;
        Node prev = null;

        while(temp.next != head){
            prev = temp;
            temp = temp.next;
        }

        prev.next = head;  // remove last node
    }

    // DELETE AT POSITION 
    public static void deleteAtPosition(int pos){
        if(head == null){
            System.out.println("List is empty!");
            return;
        }

        if(pos == 0){
            deleteAtStart();
            return;
        }

        Node temp = head;
        Node prev = null;

        for(int i = 0; i < pos; i++){
            if(temp.next == head){
                System.out.println("Position out of range!");
                return;
            }
            prev = temp;
            temp = temp.next;
        }

        prev.next = temp.next;
    }

    // Print list
    public static void printList(){
        if(head == null){
            System.out.println("List is empty!");
            return;
        }

        Node temp = head;
        System.out.print("Circular List: ");

        do{
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }while(temp != head);

        System.out.println("(head)");
    }

    public static void main(String[] args){

        createList();
        System.out.println("Original List:");
        printList();

        deleteAtStart();
        System.out.println("\nAfter deleting start:");
        printList();

        deleteAtEnd();
        System.out.println("\nAfter deleting end:");
        printList();

        deleteAtPosition(1);
        System.out.println("\nAfter deleting position 1:");
        printList();
    }
}
