
package W_MedianOfTwoSortedArray;

import java.util.*;

public class KthEleInMergedSortedArray {
    public static double Kthelement(int[] a, int[] b, int taregt) {
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
        return arr3[taregt - 1];
    }

    public static void main(String[] args) {
        int[] a = { 1, 4, 7, 10, 12 };
        int[] b = { 2, 3, 6, 15 };
        int k = 6;

        System.out.println("The element that you are searching in the sorted array is " + (int) Kthelement(a, b, k));

    }
}
