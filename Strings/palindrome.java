// palindrome 

public class palindrome {

    public static void main(String[] args) {
        String name = "madam";

        //calling the palindrome method.if return true then execute the if block or else block will be execute.
        if (isPalindrome(name)) {
            System.out.println(name + " is palindrome");
        } else {
            System.out.println(name + " is not palindrome");
        }
    }

    // accepts the one parameter and returns the boolean-
    public static boolean isPalindrome(String name) {
        // left pointer starts at index 0
        int left = 0;
        // right pointer starts at last index of the string
        int right = name.length() - 1;

        // run the loop until left pointer and right pointer
        while (left < right) {
            // check if character at left and right positions are not equal
            if (name.charAt(left) != name.charAt(right)) {
                //if mismatch found then not palindrome
                return false;
            }
            // move left pointer one step forward
            left++;
            //move right pointer one step backward
            right--;
        }
        // if loop ends without mismatch ,string palindrome
        return true;
    }
}
