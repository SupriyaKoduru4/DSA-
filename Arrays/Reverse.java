// Reverse a number

class Reverse {

    public static void main(String[] args) {
        int[] numbers = {10, 30, 28, 29, 28};
        // 28  29 28 30 10 reverse a number 
        int mid = numbers.length / 2;
        int length = numbers.length;
        for (int i = 0; i < length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < mid; i++) {
            int temp = numbers[i];
            numbers[i] = numbers[length - 1 - i];
            numbers[length - 1 - i] = temp;
        }
        for (int i = 0; i < length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}
