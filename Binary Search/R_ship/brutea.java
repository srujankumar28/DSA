
package R_ship;

import java.util.*;

public class brutea {
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
        int maxi = Integer.MIN_VALUE, sum = 0;
        for (int i = 0; i < weights.length; i++) {
            sum += weights[i];
            maxi = Math.max(maxi, weights[i]);
        }

        for (int i = maxi; i <= sum; i++) {
            if (findDays(weights, i) <= d) {
                return i;
            }
        }
        // dummy return statement:
        return -1;
    }

    public static void main(String[] args) {
        int[] weights = { 5, 4, 5, 2, 3, 4, 5, 6 }; // the ship will tarvel once per day, we should find least capacity of the ship where it transport all the weights.. here the ans is 9-->capacity... on first day(5+4), and on 2nd day(5+2), on 3rd(3+4), and on 4rth(5), and on 5th day(6)
        int d = 5; // max num of days we can take to transport all the given weights 

        int ans = leastWeightCapacity(weights, d);
        System.out.println("The minimum capacity should be: " + ans);
    }
}
