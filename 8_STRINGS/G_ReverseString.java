import java.util.*;

public class G_ReverseString {

    public static String reverse(String str) {
        String result = "";

        for (int i = 0; i <str.length(); i++) {
            result =str.charAt(i)+result;
        }
        return result;

    }

    public static void main(String args[]) {
        String str = "abcdefg";
        System.out.println(reverse(str));
    }
}
