package G_LongestRepReplace;

import java.util.*;

class Solution {
    public static int characterReplacement(String s, int k) {
        int maxLen = 0;
        int maxFreq = 0;
        int l = 0, r = 0;
        int[] hash = new int[26];

        while (r < s.length()) {
            hash[s.charAt(r) - 'A']++;
            
            maxFreq = Math.max(maxFreq, hash[s.charAt(r) - 'A']);
            
            while ((r - l + 1) - maxFreq > k) {
                hash[s.charAt(l) - 'A']--;
                maxFreq = 0;
                for (int i = 0; i < 26; ++i) {
                    maxFreq = Math.max(maxFreq, hash[i]);
                }
                l++;
            }
            maxLen = Math.max(maxLen, r - l + 1);
            r++;
        }
        return maxLen;
    }

    public static void main(String[] args) {
        String s = "AABAABBBA"; // ans=BABBA
        int k = 2;
        int length = characterReplacement(s, k);
        System.out.println("Maximum length of substring with at most " + k + " characters replaced: " + length);
    }
}
