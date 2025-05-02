package J_subarraySumDisticnt;

import java.util.HashSet;

public class brute {
    public static int distinct(int arr[], int k) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            HashSet<Integer> h = new HashSet<>();

            for (int j = i; j < arr.length; j++) {
                h.add(arr[j]);
                if (h.size() == k) {
                    count++;
                }else if(h.size()>k){
                    break;
                }

            }

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
