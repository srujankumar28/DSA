import java.util.*;

public class K_Valid_para {

    public static boolean isvalid(String str) {
        Stack<Character> s = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == '(' || ch == '{' || ch == '[') { // opening
                s.push(ch);
            } else { // closing
                if (s.isEmpty()) {
                    return false;
                }
                if ((s.peek() == '(' && ch == ')') || (s.peek() == '{' && ch == '}')
                        || (s.peek() == '[' && ch == ']')) {
                    s.pop();
                } else {
                    return false; // no opening found,, all are closing,, so when we peek,, no element matches

                }
            }
        }

        return s.isEmpty(); // when no closing is present,, all are opening itself and there is no pop done,

    }

    public static void main(String[] args) {
        String str = "{([])}";
        System.out.println(isvalid(str));
    }

}
