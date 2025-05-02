package D_FruitsBasket;

import java.util.*;

class Solution {
    public static int totalFruits(int[] fruits) {

       
        int n = fruits.length;
        int maxLen = 0;
        HashMap<Integer, Integer> mpp = new HashMap<>();
        int l = 0, r = 0;

        while (r < n) {
            mpp.put(fruits[r], mpp.getOrDefault(fruits[r], 0) + 1);

            /*
             * If number of different fruits exceeds
             * 2 shrink the window from the left
             */
        
                while (mpp.size() > 2) {
                    mpp.put(fruits[l], mpp.get(fruits[l]) - 1);
                    if (mpp.get(fruits[l]) == 0) {
                        mpp.remove(fruits[l]);
                    }
                    l++;
                }
            

            /*
             * If number of different fruits
             * is at most 2, update maxLen
             */
            if (mpp.size() <= 2) {
                maxLen = Math.max(maxLen, r - l + 1);
            }

            r++;
        }

        return maxLen;
    }

    public static void main(String[] args) {
        int[] input = { 3, 3, 3, 3,3,3,1,1,1,1,2};
        int length = totalFruits(input);
        System.out.println("Maximum fruits the basket can have: " + length); // fruits needs to be picked continously
    }
}
