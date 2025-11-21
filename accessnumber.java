// Access a number in array

// public class accessnumber {
//     public static void main(String[] args) {
//         int[] numbers = {30, 49, 45, 12, 344};
//         System.out.println(numbers[2]);
//     }
// }



// we dont know the array inside number and we need to assign number to array
public class accessnumber {

    public static void main(String[] args) {
        int[] marks = new int[5];  //left side part declaration part and compile time lo a marks ani cheppi vaka array create avuthundi and right side runtime appudu create avuthundi and integer array ni heap area lo create avuthundi .
        marks[0] = 21;
        marks[1] = 34;
        marks[2] = 66;
        marks[3] = 76;
        marks[4] = 56;
        // System.out.println(marks[2]);

        //insert new number to array.so create a new bigger array.
        int[] newMarks = new int[marks.length + 1];
         
        // copy old values
        for (int i = 0; i < marks.length; i++) {
            newMarks[i] = marks[i];
        }

        // insert new value 90 at last position
        newMarks[newMarks.length - 1] = 90;

        // print all elements of new array
        for (int i = 0; i < newMarks.length; i++) {
            System.out.println(newMarks[i]);
        }
    }

}
