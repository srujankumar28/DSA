package L_peakElement;

import java.util.ArrayList;

public class brute {

    public static ArrayList<Integer> peak(int arr[]) {
        int n = arr.length;
        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                if (arr[i + 1] < arr[i]) {
                    ans.add(arr[i]);
                }
            } else if (i == n - 1) {
                if (arr[i] > arr[i - 1]) {
                    ans.add(arr[i]);
                }
            } else if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                ans.add(arr[i]);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 5, 2, 6, 7, 8, 5, 1 };
        ArrayList<Integer> ans = peak(arr);
        for (int n : ans) {
            System.out.print(n + " ");
        }
    }

}
