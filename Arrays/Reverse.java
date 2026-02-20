// // Reverse a number

// // brute force
// class Reverse {

//     public static void main(String[] args) {
//         int[] numbers = {10, 30, 28, 29, 28};
//         // 28  29 28 30 10 reverse a number 
//         int mid = numbers.length / 2;
//         int length = numbers.length;
//         for (int i = 0; i < length; i++) {
//             System.out.print(numbers[i] + " ");
//         }
//         System.out.println();
//         for (int i = 0; i < mid; i++) {
//             int temp = numbers[i];
//             numbers[i] = numbers[length - 1 - i];
//             numbers[length - 1 - i] = temp;
//         }
//         for (int i = 0; i < length; i++) {
//             System.out.print(numbers[i] + " ");
//         }
//     }
// }



// reverse a array 

class Reverse{
    public static void main(String[] args) {
        // Declare the array values
        int array[] = {45, 65, 78, 98, 34};
        // Find length of array and stores the total no.of elements in the array
        int n = array.length;
       
        for(int i=0; i< array.length/2; i++){
            // Stores the current element at index i in a temporary variable.
            int temp = array[i];
            // Assigns the value from the end of the array to the current index.
            array[i]=array[n-1-i];
            // Places the stored value (temp) into the position at the end.
            array[n-1-i] = temp;
        }
         // Prints each element of the reversed array.
        for(int i=0; i<array.length; i++){
            System.out.println(array[i]+ " ");
        }
    }
}