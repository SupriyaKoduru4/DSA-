// Take a plates example.
// Stack on plates  => you always add a new plate on top. --> this push
// => if the rack is full you cannot add more --> this is overflow
// => the last plate you placed comes out first --> LIFO

public class Push {

    // An integer array that stores the plates inside the rack.
    int[] stack;
    // top tells where the top plate is placed.   
    int top;
    // Maximum number of plates this rack can hold.
    int capacity;    

    // Constructor
    Push(int size) {
        capacity = size;
        stack = new int[capacity];
        top = -1; // empty stack
    }

    // PUSH operation – adding a plate
    public void push(int plate) {

        // 1) Check if rack is full
        if (top == capacity - 1) {
            System.out.println("Rack is FULL! Cannot add plate: " + plate);
            return;
        }

        // 2) Move top pointer one step UP
        top++;

        // 3) Place plate at this new top position
        stack[top] = plate;

        System.out.println("Added plate " + plate + " at position " + top);
    }

    // Print plates
    public void print() {
        if (top == -1) {
            System.out.println("Rack is empty");
            return;
        }
        System.out.print("Plates (bottom → top): ");
        for (int i = 0; i <= top; i++) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Push rack = new Push(3);

        rack.push(101);
        rack.push(102);
        rack.push(103);
        rack.push(104);

        rack.print();
    }
}
