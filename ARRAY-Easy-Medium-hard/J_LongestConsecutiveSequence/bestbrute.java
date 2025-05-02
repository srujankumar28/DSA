package J_LongestConsecutiveSequence;

import java.util.*;

class bestbrute {
    public static int lonestarr(int arr[]) {
        if (arr.length == 0) {
            return 0;
        }

        // Sort the array first
        Arrays.sort(arr);

        int maxCount = Integer.MIN_VALUE;
        int currentCount = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - arr[i - 1] == 1) {
                // If current element is consecutive to the previous element
                currentCount++;
                maxCount = Math.max(maxCount, currentCount);
            } else {
                // If current element is not a duplicate of the previous element
                // Reset the current count
                currentCount = 1; // new series is going to start
                
            }
            
            
        }

        return maxCount;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2,3, 4, 5, 6, 7,8,9,10,11,12,13 };
        System.out.println(lonestarr(arr)); 
    }
}
