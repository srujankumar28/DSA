package Q_SmallestDivisor;

import java.util.*;

public class brute {
    public static int smallestDivisor(int[] arr, int limit) {
        int n = arr.length; // size of array.
        // Find the maximum element:
        int maxi = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            maxi = Math.max(maxi, arr[i]);
        }

        // Find the smallest divisor:
        for (int d = 1; d <= maxi; d++) {
            // Find the summation result:
            int sum = 0;
            for (int i = 0; i < n; i++) {
                sum += Math.ceil((double) (arr[i]) / (double) (d)); //remeber   ceil(1/4)=1;
            }
            if (sum <= limit)
                return d;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 }; // u should find the number in such a way that when we divide the elemnts of the array by thst number, after division the summation of ceil(rounded off to the highest val) value should be lesser or eqaul to limit(threshold)
        
        // not possible return -1
        int limit = 8;
        int ans = smallestDivisor(arr, limit);
        System.out.println("The minimum divisor is: " + ans);
    }
}
