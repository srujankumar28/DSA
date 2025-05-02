package S_KthMissingPositiveNumber;

import java.util.*;

public class brute {
    public static int missingK(int[] vec, int n, int k) {
        for (int i = 0; i < n; i++) {
            if (vec[i] <= k)
                k++; // shifting k
            else
                return k;
        }
        return k;
    }

    public static void main(String[] args) {
        int[] vec = { 2,3,5,7,8,9,10,13 }; // to find the kth missing number in which the first number starts from 1 2 3 4 5 like this... we need to find kth missing.. here it is 11 because first missing->1 and then 4-> 6->11
        int n = 8, k = 4;
        int ans = missingK(vec, n, k);
        System.out.println("The missing number is: " + ans);
    }
}
