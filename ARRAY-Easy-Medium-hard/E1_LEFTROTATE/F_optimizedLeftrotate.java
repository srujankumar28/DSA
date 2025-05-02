package E1_LEFTROTATE;

import java.util.*;

public class F_optimizedLeftrotate {

    public static int[] reverse(int arr[], int i, int j) {
        int start = i;
        int end = j;
        while (start <= end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;

        }
        return arr;

    }

    public static void main(String[] args) {
        int arr[] = { 2, 3, 4, 5, 6, 8, 9 };
        int k = 3;
        reverse(arr, 0, k - 1);
        reverse(arr, k, arr.length - 1);
        int ans[]=reverse(arr, 0, arr.length - 1);
        for (int e : ans) {
            System.out.print(e + " ");
        }
    }

}
