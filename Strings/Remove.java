// remove duplicates in string 

public class Remove {

    public static void main(String[] args) {
        String name = "aaeegfdvvvwtteftt";
        String result = "";
        for (int i = 0; i < name.length(); i++) {
            if (result.indexOf(name.charAt(i)) == -1) {
                result = result + name.charAt(i);
            }
        }
        System.out.println("After removing duplicates: " + result);
    }
}
