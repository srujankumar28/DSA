package G5_Sort_012;

import java.util.*;

public class brute {
    public static ArrayList<Integer> zeroonetwo(int arr[]) {
        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                ans.add(arr[i]);
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                ans.add(arr[i]);
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) {
                ans.add(arr[i]);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = { 0, 0, 1, 1, 0, 2, 2, 2, 0, 1 };
        ArrayList<Integer> ans = zeroonetwo(arr);

        for (int i : ans) {
            System.out.print(i + " ");
        }
    }

}
