package G9_RearrangeBySign;

import java.util.ArrayList;

public class optimal2ndType {
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

        if (pos.size() > neg.size()) {
            for (int i = 0; i < neg.size(); i++) {
                arr[2 * i] = pos.get(i);
                arr[2 * i + 1] = neg.get(i);
            }
            int idx = neg.size() * 2; // THAT MUCH ELEMENT IS ALREADY FILLED IN THE ARRAY
            for (int i = neg.size(); i < pos.size(); i++) {
                arr[idx] = pos.get(i);
                idx++;

            }
        } else {
            for (int i = 0; i < pos.size(); i++) {
                arr[2 * i] = pos.get(i);
                arr[2 * i + 1] = neg.get(i);
            }
            int idx = pos.size() * 2; // THAT MUCH ELEMENT IS ALREADY FILLED IN THE ARRAY
            for (int i = pos.size(); i < neg.size(); i++) {
                arr[idx] = neg.get(i);
                idx++;

            }

        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = { -3, 9, -2, -3, -2, 1, 1, 2, 3, 4, -2, 3, 5 }; // NUMBER OF POS IS NOT EQAUL TO NUMBER OF NEG

        int res[] = rearrange(arr);
        for (int e : res) {
            System.out.print(e + " ");
        }

    }

}
