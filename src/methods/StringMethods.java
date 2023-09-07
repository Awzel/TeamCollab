package methods;

public class StringMethods {


    public static void main(String[] args) {

        String str = "reversed";
        System.out.println(reverseString(str));

    }

    public static String reverseString(String str){

        String reversed = "";

        for (int i = str.length()-1; i >= 0 ; i--) {
            reversed += str.charAt(i);
        }

        return reversed;
    }

}
