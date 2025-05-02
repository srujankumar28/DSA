package J_subarraySumDisticnt;

import java.util.*;

public class optimal {
    public static int distinct(int arr[], int k) {
        return ans(arr, k) - ans(arr, k - 1);
    }

    public static int ans(int arr[], int k) {
        if (k <= 0) {
            return 0;
        }
        int l = 0;
        int r = 0;
        int count = 0;
        int n = arr.length;
        HashMap<Integer, Integer> h = new HashMap<>();
        while (r < n) {

            h.put(arr[r], h.getOrDefault(arr[r], 0) + 1);
            while (h.size() > k) {
                h.put(arr[l], h.get(arr[l])- 1);
                if (h.get(arr[l]) == 0) {
                    h.remove(arr[l]);
                }
                l++;
            }

            count += r - l + 1;
            r++;

        }
        return count;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 1, 3, 4 }; // need to return the count which is equal to number of subarrays which is
        // having k distinct elements
        int k = 3;
        System.out.println(distinct(arr, k));
    }

}
