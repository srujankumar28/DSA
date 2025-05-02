package I_Leaders;

import java.util.ArrayList;

public class optimal {
    public static ArrayList<Integer> leaders(int arr[]) {
        ArrayList<Integer> a = new ArrayList<>();
        int max = arr[arr.length - 1];

        a.add(arr[arr.length - 1]); // last element is always a leader.. no greater ele present after that
        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] > max) {
                a.add(arr[i]);
                max = arr[i];
            }
        }
        return a;

    }

    public static void main(String[] args) {
        int arr[] = { 10, 22, 12, 3, 0, 6 };
        ArrayList<Integer> a = leaders(arr);
        a.sort(null); // if u want the elements in sorted order
        for (int e : a) {
            System.out.print(e + " ");
        }
    }

}
