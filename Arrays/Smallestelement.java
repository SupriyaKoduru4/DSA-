// Find smallest element

public class Smallestelement {

    public static void main(String[] args) {
        int[] num = {28, 19, 387, 397, 272};
        int min = num[0];
        for (int i = 1; i < num.length; i++) {
            if (num[i] < min) {
                min = num[i];
            }

        }
        System.out.println("smallest number :" + min);
    }
}
