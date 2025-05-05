package StringReverse;

import java.util.*;

public class E_StringReverse {

    public static String reverseString(String str) {

        Stack<Character> s = new Stack<>();
        int idx = 0;
        while (idx <=str.length()-1) {
            s.push(str.charAt(idx));
            idx++;

        }

        StringBuilder result = new StringBuilder("");
        while (!s.isEmpty()) {
            char curr = s.pop();
            result.append(curr);

        }
        return result.toString();   
    }

    public static void main(String[] args) {
        String str = "abc";
        System.out.println(reverseString(str));

    }

}
