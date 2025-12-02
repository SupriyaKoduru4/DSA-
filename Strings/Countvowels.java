// count how many vowels are in the string

public class Countvowels {

    public static void main(String[] args) {
        // This is the string in which we want to count vowels
        String s1 = "hello supriya";
        // counter starts at 0
        int vowels = 0;

        //Convert the string to lowercase so we donot miss uppercase vowels.
        s1 = s1.toLowerCase();
        // Loop through every character in the string
        for (int i = 0; i < s1.length(); i++) {
            // Get the character at index i
            char c = s1.charAt(i);

            // If character is a vowel → increase count
            if (c == 'a' || c == 'e' || c == 'i'
                    || c == 'o' || c == 'u') {
                vowels++;
            }
        }

        System.out.println("Total vowels = " + vowels);

    }
}
