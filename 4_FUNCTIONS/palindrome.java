import java.util.*;

public class palindrome {

    public static boolean ispalindrome(int number) {
        int n = number;

        int reverse = 0;

        while (number > 0) {
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number / 10;
        }

        return n==reverse;

    }

    public static void main(String args[]) {

        int n = 21;

        System.out.println(ispalindrome(n));
    }

}
