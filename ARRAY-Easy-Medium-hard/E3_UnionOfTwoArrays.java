import java.util.ArrayList;

public class E3_UnionOfTwoArrays { // SORTED ARRAYS
    public static ArrayList<Integer> union(int arr1[], int arr2[], int m, int n) {
        int i = 0;
        int j = 0;

        ArrayList<Integer> union = new ArrayList<>();

        while ((i < m) && (j < n)) {
            if (arr1[i] <= arr2[j]) {
                if ((union.size() == 0) || union.get(union.size() - 1) != arr1[i]) { // (union.size() == 0) -> for the
                                                                                     // first element to enter
                    union.add(arr1[i]);
                }
                i++;
            } else {

                if ((union.size() == 0) || union.get(union.size() - 1) != arr2[j]) {
                    union.add(arr2[j]);
                }
                j++;

            }

        }

        while (i < m) {
            if ((union.size() == 0) || union.get(union.size() - 1) != arr1[i]) {
                union.add(arr1[i]);
            }
            i++;
        }

        while (j < n) {
            if ((union.size() == 0) || union.get(union.size() - 1) != arr2[j]) {
                union.add(arr2[j]);
            }
            j++;
        }

        return union;

    }

    public static void main(String[] args) {
        int arr1[] = { 1, 2, 3, 3, 3, 4, 5 };
        int arr2[] = { 4, 4, 4, 5, 5, 6, 6 };
        int m = arr1.length;
        int n = arr2.length;
        ArrayList<Integer> union = union(arr1, arr2, m, n);
        for (int val : union) {
            System.out.print(val + " ");
        }

    }
}

// import java.util.*;

// class E3_UnionOfTwoArrays {
// static ArrayList<Integer> FindUnion(int arr1[], int arr2[], int n, int m) {
// HashSet<Integer> s = new HashSet<>();
// ArrayList<Integer> Union = new ArrayList<>();
// for (int i = 0; i < n; i++)
// s.add(arr1[i]);
// for (int i = 0; i < m; i++)
// s.add(arr2[i]);
// for (int it : s)
// Union.add(it);
// return Union;
// }

// public static void main(String args[]) {
// int n = 10, m = 7;
// int arr1[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
// int arr2[] = { 2, 3, 4, 4, 5, 11, 12 };
// ArrayList<Integer> Union = FindUnion(arr1, arr2, n, m);
// System.out.println("Union of arr1 and arr2 is ");
// for (int val : Union)
// System.out.print(val + " ");
// }
// }
