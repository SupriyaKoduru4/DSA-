// swapping 2 numbers 

public class Swapping {

    public static void main(String[] args) {
        int[] marks = {20, 39, 37, 46, 28};
        // assign a number to one index
        int i = 1;
        int j = 4;
        //swapping the numbers
        int temp = marks[i];
        marks[i] = marks[j];
        marks[j] = temp;
        for (int num : marks) {
            System.out.println(num);
        }
    }
}
