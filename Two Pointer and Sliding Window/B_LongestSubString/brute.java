package B_LongestSubString;

import java.util.HashSet;
import java.util.Set;

public class brute {
    public static int longest(String str) {

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < str.length(); i++) {
            HashSet<Character> h = new HashSet<>();
            for (int j = i; j < str.length(); j++) {
                if (h.contains(str.charAt(j))) {
                    break;
                }
                int length = j - i + 1;
                max = Math.max(max, length);
                h.add(str.charAt(j));
            }

        }
        return max;

    }

    public static void main(String[] args) {
        String str = "cadbzabcd";  // longest substring without repeating characters
        System.out.println(longest(str));
    }

}
