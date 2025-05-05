
package W_MedianOfTwoSortedArray;

import java.util.*;

public class brute {
    public static double median(int[] a, int[] b) {
        // Size of two given arrays
        int n1 = a.length;
        int n2 = b.length;

        int arr3[] = new int[n1 + n2];
        // Apply the merge step
        int i = 0, j = 0, k = 0;
        while (i < n1 && j < n2) {
            if (a[i] < b[j]) {
                arr3[k] = a[i];
                i++;
            } else {
                arr3[k] = b[j];
                j++;
            }
            k++;
        }

        // Copy the left-out elements
        while (i < n1) {
            arr3[k] = a[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr3[k] = b[j];
            j++;
            k++;
        }

        // Find the median
        int n = n1 + n2;
        if (n % 2 == 1) {
            return (double) arr3[n / 2];
        }

        return ((double) arr3[n / 2] + (double) arr3[n / 2 - 1]) / 2.0;
      
    }

    public static void main(String[] args) {
        int[] a = { 1, 4, 7, 10, 12 };
        int[] b = { 2, 3, 6, 15 };
        System.out.println("The median of two sorted arrays is " + median(a, b));
    }
}
