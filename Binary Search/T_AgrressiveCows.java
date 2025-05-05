
import java.util.*;

public class T_AgrressiveCows {
    public static boolean canWePlace(int[] stalls, int dist, int cows) {
        int n = stalls.length; // size of array
        int cntCows = 1; // no. of cows placed
        int last = stalls[0]; // position of last placed cow.
        for (int i = 1; i < n; i++) {
            if (stalls[i] - last >= dist) {
                cntCows++; // place next cow.
                last = stalls[i]; // update the last location.
            }
        }
        return (cntCows >= cows);
    }

    public static int aggressiveCows(int[] stalls, int k) {
        int n = stalls.length; // size of array
        // sort the stalls[]:
        Arrays.sort(stalls);
        int ans = 0;

        int low = 1, high = stalls[n - 1] - stalls[0];// low=0; and high=100 also possible,, dont think about the low
                                                      // and high very much,, anyway we are doing binary search between
                                                      // the range,, so range i guess not going to matter(i guess)
        // apply binary search:
        while (low <= high) {
            int mid = (low + high) / 2;
            if (canWePlace(stalls, mid, k) == true) {
                ans = mid;

                low = mid + 1;
            } else
                high = mid - 1;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] stalls = { 0, 3, 4, 7, 10, 9 }; 
        // after sorting--> 0,3,4,7,9,10
        // distnaces
        // from 0 to 3 there is 3 distamce like that.. and we should return the max of
        // min distance bw the two cows which will be stored in the stalls and all the
        // cows should be stored
        int k = 4; // number of cows that has to be placed
        int ans = aggressiveCows(stalls, k);
        System.out.println("The maximum possible minimum distance is: " + ans);
    }
}
