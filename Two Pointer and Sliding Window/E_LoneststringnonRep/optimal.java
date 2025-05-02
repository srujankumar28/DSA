package E_LoneststringnonRep;

import java.util.*;

class Solution {

    public static int kDistinctChar(String s, int k) {

        int l = 0, r = 0, maxLen = 0;
        HashMap<Character, Integer> mpp = new HashMap<>();

        while (r < s.length()) {
            mpp.put(s.charAt(r), mpp.getOrDefault(s.charAt(r), 0) + 1);
            while (mpp.size() > k) {
                mpp.put(s.charAt(l), mpp.get(s.charAt(l)) - 1);
                if (mpp.get(s.charAt(l)) == 0) {
                    mpp.remove(s.charAt(l));
                }
                l++;
            }

            maxLen = Math.max(maxLen, r - l + 1);

            r++;

        }
        return maxLen;
    }

    public static void main(String[] args) {
        String s = "aaabbcccccaa";
        int res = kDistinctChar(s, 2);
        System.out.println("The maximum length of substring with at most 2 distinct characters is: " + res);
    }
}
