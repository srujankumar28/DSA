package Intersection;

import java.util.ArrayList;

public class F_IntersectionOptimal {

    public static ArrayList<Integer> intersection(int arr1[], int arr2[]) {
        ArrayList<Integer> a = new ArrayList<>();
        int i = 0;
        int j = 0;
        int m = arr1.length;
        int n = arr2.length;

        while ((i < m) && (j < n)) {
            if (arr1[i] < arr2[j]) {
                i++;
            } else if (arr2[j] < arr1[i]) {
                j++;
            } else { // EQUAL CONDITION
                a.add(arr1[i]);
                i++;
                j++;
            }

        }
        return a;
    }

    public static void main(String[] args) {
        int arr1[] = { 1, 2, 2, 2, 3, 3 ,6};
        int arr2[] = { 0,1, 3, 4, 5,6 };
        ArrayList<Integer> intersection = intersection(arr1, arr2);
        for (int val : intersection) {
            System.out.print(val + " ");
        }
    }

}
