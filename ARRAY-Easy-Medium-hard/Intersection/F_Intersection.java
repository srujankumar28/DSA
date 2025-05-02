package Intersection;
// BRUTE FORCE

import java.util.*;

public class F_Intersection {

    public static ArrayList<Integer> intersection(int arr1[], int arr2[]) {
        ArrayList<Integer> inter = new ArrayList<>();
        int present[] = new int[Math.max(arr1.length, arr2.length)];
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if ((arr1[i] == arr2[j]) && (present[j] == 0)) {
                    inter.add(arr1[i]);
                    present[j] = 1;

                    break;
                }

                // if(arr2[j]>arr1[i]){
                // break;
                // }

            }
        }

        return inter;
    }

    public static void main(String[] args) {
        int arr1[] = { 1, 2, 3, 3, 3 };
        int arr2[] = { 2, 3, 5 };
        ArrayList<Integer> intersection = intersection(arr1, arr2);
        for (int val : intersection) {
            System.out.print(val + " ");
        }
    }

}
