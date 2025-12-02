// Find largest element in array

public class Largestelement {

    public static void main(String[] args) {
        // create an integer array
        int[] num = {20, 23, 45, 56, 77, 33};
        // assume first element of the array is largest
        int max = num[0];

        //start a for loop from index 1 upto last
        for (int i = 1; i < num.length; i++) {
            // check the current array element bigger than max
            if (num[i] > max) {

                // if yes, update max with the new largest value
                max = num[i];
            }
        }
        System.out.println("largest element :" + max);

    }
}
