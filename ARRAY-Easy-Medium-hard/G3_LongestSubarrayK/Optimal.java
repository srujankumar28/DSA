package G3_LongestSubarrayK;

import java.util.*;

public class Optimal {

    public static int max(int arr[], int k) {
        Map<Long, Integer> preSum = new HashMap<>();

        long sum = 0;
        int maxLen = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if (sum == k) {
                maxLen =i+1;
            }

            long rem = sum - k;

            if (preSum.containsKey(rem)) {
                int len = i - preSum.get(rem);
                maxLen = Math.max(maxLen, len);
            }

            if (!preSum.containsKey(sum)) {
                preSum.put(sum, i);
            }
        }
        return maxLen;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 3, 5, 1, 7,1,1 }; // TRY TO DO THE DRY RUN FOR {1,2,3,1,1,1};
        System.out.println(max(arr, 10));
    }

}
