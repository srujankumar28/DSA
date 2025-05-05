package StringReverse;

import java.util.*;

public class StringReverse {

    public static String reverse(String str) {
        Stack<Character> s = new Stack<>();

        char ch[] = str.toCharArray();

        for (char c : ch) {
            s.push(c);
        }
        for (int i = 0; i < ch.length; i++) {
            ch[i] = s.pop();

        }
        return new String(ch);
    }

    public static void main(String[] args) {
        System.out.println("Enter your string ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println("Before Reversing " + str);
        System.out.println("After Reversing " + reverse(str));

    }

}
