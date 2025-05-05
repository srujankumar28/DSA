
package R_ship;

import java.util.*;

public class optimal {
    public static int findDays(int[] weights, int cap) {
        int days = 1; // First day.
        int load = 0;
        int n = weights.length; // size of array.
        for (int i = 0; i < n; i++) {
            if (load + weights[i] > cap) {
                days += 1; // move to next day
                load = weights[i]; // load the weight.
            } else {
                // load the weight on the same day.
                load += weights[i];
            }
        }
        return days;
    }

    public static int leastWeightCapacity(int[] weights, int d) {
        // Find the maximum and the summation:
        int low = Integer.MIN_VALUE, high = 0;  // low can be zero also..no problem in that
        for (int i = 0; i < weights.length; i++) {
            high += weights[i]; // sum 
            low = Math.max(low, weights[i]); // max -> the ship tarvels once per day.. thats y max of the among the givem weights is the min range..
        }

        while (low <= high) {
            int mid = (low + high) / 2;
            int numberOfDays = findDays(weights, mid);
            if (numberOfDays <= d) {
                // eliminate right half
                high = mid - 1;  // we need min,, so come to left
            } else {
                // eliminate left half
                low = mid + 1;
            }
        }
        return low;
    }

    public static void main(String[] args) {
        int[] weights = { 5, 4, 5, 2, 3, 4, 5, 6 };   // the ship will tarvel once per day, we should find least capacity of the ship where it transport all the weights.. here the ans is 9-->capacity... on first day(5+4), and on 2nd day(5+2), on 3rd(3+4), and on 4rth(5), and on 5th day(6)
        // max num of days we can take to transport all the given weights 
        int d = 5;
        int ans = leastWeightCapacity(weights, d);
        System.out.println("The minimum capacity should be: " + ans);
    }
}
