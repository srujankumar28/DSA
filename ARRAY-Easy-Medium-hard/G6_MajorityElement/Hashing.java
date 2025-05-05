package G6_MajorityElement;

class Hashing {

    public static int majority(int arr[]) {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            max = Math.max(arr[i], max); // u should find the max element for the array which is not having any majority
                                         // element.. if u dont find max and simply if u write arr.length +1 as the size
                                         // of hash array it is going to give u the error.
        }

        int hash[] = new int[max + 1];
        for (int i = 0; i < arr.length; i++) {
            hash[arr[i]]++;
        }
        for (int i = 0; i < hash.length; i++) {
            if (hash[i] > arr.length / 2) { // and remember here also.. try to select the hash[i] instead of
                                            // hash[arr[i]] and also obviously while returning also use i and not
                                            // arr[i].
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3,3,3,3 }; // try out-> [1,1,1,2,2,2,2,2,2,2] ans-> 2
        System.out.println(majority(arr));

    }
}

// package G6_MajorityElement;

// import java.util.*;

// public class Hashing {
// public static int majority(int arr[]) {
// HashMap<Integer, Integer> mpp = new HashMap<>();
// for (int i = 0; i < arr.length; i++) {
// int val = mpp.getOrDefault(arr[i], 0);
// mpp.put(arr[i], val + 1);
// }

// for (Map.Entry<Integer, Integer> e : mpp.entrySet()) {
// if (e.getValue() > (arr.length) / 2) {
// return e.getKey();
// }

// }
// return -1;
// }

// public static void main(String[] args) {
// int arr[] = { 2, 2, 1, 1, 1, 2, 2 };
// System.out.println(majority(arr));

// }
// }
