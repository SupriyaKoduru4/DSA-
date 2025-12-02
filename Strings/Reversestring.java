// reverse a string 

public class Reversestring {

    public static void main(String[] args) {
        // string is a data type and "s" is a variable name and assign the value supriya to variable "s".
        String s = "Supriya";

        // string is a data type and rev is a variable name and empty string.
        String rev = " ";

        //int means integer and length of the string  -1 is last index and condition i is bigger than zero then run the loop until  i become 0.
        for (int i = s.length() - 1; i >= 0; i--) {
            //Add the character to the end of rev
            rev += s.charAt(i);
        }
        System.out.println(rev);
    }
}
