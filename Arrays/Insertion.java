// adding element at patricular position 

public class Insertion {

    public static void main(String[] args) {
        int[] arr = {20, 39, 28, 309, 29};
        int position = 3;  // index position
        int value = 98;    // assign a value that position

        int[] newArr = new int[arr.length + 1];

        for (int i = 0; i < position; i++) {
            newArr[i] = arr[i];
        }

        //insert value 
        newArr[position] = value;

        for (int i = position; i < arr.length; i++) {
            newArr[i + 1] = arr[i];
        }

        //print result
        for (int x : newArr) {
            System.out.println(x);
        }
    }
}
