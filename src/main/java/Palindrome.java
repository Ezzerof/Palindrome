import java.util.Scanner;

public class Palindrome {

    public static boolean palindromeCheck(String original){

        boolean result = false;

        StringBuilder sb = new StringBuilder(original);
        sb.reverse();
        String reversed = sb.toString();

        if (reversed.length() > original.length()) {
            return result;
        } else {

            for (int i = 0; i < reversed.length(); i++){
                char ch = reversed.charAt(i);

                if (original.charAt(i) == ch){
                    result = true;
                } else {
                    return result;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String userInput = input.next();

        System.out.println(palindromeCheck(userInput));

    }

}
