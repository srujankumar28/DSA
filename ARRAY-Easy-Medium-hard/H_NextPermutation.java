import java.util.*;

public class H_NextPermutation {
    public static int[] nextGreaterPermutation(int[] A) {
        int n = A.length; // size of the array

        // Step 1: Find the break point
        int ind = -1; // break point
        for (int i = n - 2; i >= 0; i--) {
            if (A[i] < A[i + 1]) {
                ind = i;
                break;
            }
        }

        // If break point does not exist:
        if (ind == -1) {
            // reverse the whole array  // becuase we know that it is last possible permutation and after this we have the next permutation-> reverse the array
            reverse(A, 0, n - 1);
            return A;
        }

        // Step 2: Find the next greater element and swap it with A[ind]
        for (int i = n - 1; i > ind; i--) {
            if (A[i] > A[ind]) {   
                int tmp = A[i];
                A[i] = A[ind];
                A[ind] = tmp;
                break;
            }
        }

        // Step 3: Reverse the right half
        reverse(A, ind + 1, n - 1);

        return A;
    }

    // Helper function to reverse a portion of the array
    private static void reverse(int[] A, int start, int end) {
        while (start < end) {
            int tmp = A[start];
            A[start] = A[end];
            A[end] = tmp;
            start++;
            end--;
        }
    }

    public static void main(String args[]) {
        int[] A =   {3,2,1};//  {1, 2, 3, 6, 5, 4};  //{2, 1, 5, 4, 3, 0, 0}
        int[] ans = nextGreaterPermutation(A);

        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}
