// public class D_DuplicateInSorted {

//     public static int duplicate(int arr[]){
//         int i=0;
//         int count=1;
//         for(int j=1;j<arr.length;j++){
//             if(arr[i]!=arr[j]){
//                i++;

//                arr[i]=arr[j];
//             }
//         }
//         return i+1;

//     }
//     public static void main(String[] args) {
//         int arr[]={1,2,2,2,3,3,4,4};    // calculate the total number of the unique elements in the array
//         System.out.println(duplicate(arr));

//     }

// }

//----------------------------------------------------------------------------------------------------------------

// import java.util.Arrays;
// import java.util.HashSet;

// class zzzzzz {
//     public static int unique(int arr[]) {
//         HashSet<Integer> hm = new HashSet<>();
//         for (int i = 0; i < arr.length; i++) {
//             hm.add(arr[i]);

//         }
//         return hm.size();
//     }

//     public static void main(String[] args) {
//         int arr[] = { 1, 1, 1, 2, 2, 3, 3, 4, 4, 5 };
//         System.out.println(unique(arr));

//     }
// }

//-------------------------------------------------------------------------------------------------------------------------------------

import java.util.ArrayList;

class D_DuplicateInSorted {
    public static ArrayList<Integer> isContainsDuplicate(int arr[]) {
        ArrayList<Integer> ans = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);

        }

        int hash[] = new int[max + 1];

        for (int i = 0; i < arr.length; i++) {
            hash[arr[i]]++;

        }
        for (int i = 0; i < hash.length; i++) {
            if (hash[i] > 1) {
                ans.add(i);
            }
        }
        return ans;

    }

    public static void main(String[] args) {
        int arr[] = { 1, 1, 2, 2, 2, 2, 3, 3, 3, 4, 4 };
        ArrayList<Integer> ans = isContainsDuplicate(arr);
        for (int i : ans) {
            System.out.print(i + " ");
        }
    }
}