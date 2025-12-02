// public class searching {                              //creating a class for searching
//     public static void main(String[] args){          //program execution begins here
//         int a=29;                                   //You are searching for the number 29.
//         int[] marks = {40,20,40,20,29};            //declare a array and An integer array containing 5 values.
//         for(int i=0; i<marks.length; i++){        //Loop through all elements from index 0 to last index.
//             if(marks[i]==a){                     //Check if current array element equals 29.
//             System.out.println("founded");      //If match found print founded.
//             }
//         }
//     }
// }

public class searching {

    public static void main(String[] args) {
        int a = 50;
        int[] marks = {20, 10, 40, 29, 60};

        boolean isFound = false;

        for (int i = 0; i < marks.length; i++) {
            if (marks[i] == a) {
                isFound = true;
                break;
            }
        }

        if (isFound) {
            System.out.println("found");
        } else {
            System.out.println("not found");
        }
    }
}
