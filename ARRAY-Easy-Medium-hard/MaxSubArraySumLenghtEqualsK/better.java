package MaxSubArraySumLenghtEqualsK;

import java.util.*;

public class better {
    public static int maxLen(int A[], int n) {

        HashMap<Integer, Integer> mpp = new HashMap<Integer, Integer>();

        int maxi = 0;
        int sum = 0;

        for (int i = 0; i < n; i++) {

            sum += A[i];

            if (sum == 0) {
                maxi = i + 1;
            } else {
                if (mpp.get(sum) != null) {

                    maxi = Math.max(maxi, i - mpp.get(sum));
                } else {

                    mpp.put(sum, i);
                }
            }
        }
        return maxi;
    }

    public static void main(String[] args) {
        int A[] = { 9, -3, 3, -1, 6, -5 };
        System.out.println(maxLen(A, 6)); // n=length of array

    }

}
