package G9_RearrangeBySign;

import java.util.ArrayList;

public class brute {
    public static int[] rearrange(int arr[]) {
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                pos.add(arr[i]);
            } else {
                neg.add(arr[i]);
            }
        }

        for (int i = 0; i < arr.length/2; i++) {
            arr[2 * i] = pos.get(i);
            arr[2 * i + 1] = neg.get(i);

        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = { 3, 1, -2, -5, 2, -4 }; // 3,-2,1,-5,2,-4  // NUMBER OF POS AND NEG WILL BE SAME
        int res[] = rearrange(arr);
        for (int e : res) {
            System.out.print(e + " ");
        }

    }

}