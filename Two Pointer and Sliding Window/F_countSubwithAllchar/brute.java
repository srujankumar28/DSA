// Input : s = "abcba"

// Output : 5

// Explanation : The substrings containing at least one occurrence of the characters 'a' , 'b' , 'c' are "abc" , "abcb" , "abcba" , "bcba" , "cba".
package F_countSubwithAllchar;

import java.util.*;

class brute {
    public static int numberOfSubstrings(String s) {
        int count = 0;

        for (int i = 0; i < s.length(); ++i) {
            int[] hash = new int[3];

            for (int j = i; j < s.length(); ++j) {

                hash[s.charAt(j) - 'a'] = 1; // for 'a' hash[a-a]--> hash[0] will be 1...
                                             // for 'b' hash[b-a]--> hash[1] will be 1....
                if (hash[0] + hash[1] + hash[2] == 3) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String s = "bbacba"; // we need to return the number of substring that is having a b and c.


        int ans = numberOfSubstrings(s);

        
        System.out.println("Number of substrings containing 'a', 'b', 'c' in \"" + s + "\" is: " + ans);
    }
}
