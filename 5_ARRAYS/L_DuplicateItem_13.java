// public class DuplicateItem_13 {

//     public static boolean ContiansDuplicate(int nums[]) {

//         for (int i = 0; i < nums.length; i++) {
//             for (int j = i + 1; j < nums.length; j++) {
//                 if (nums[i] == nums[j])
//                     return true;
//             }
//         }

//         return false;

//     }

//     public static void main(String args[]) {

//         int nums[] = { 1, 2, 2, 3 };
//         System.out.println(ContiansDuplicate(nums));
//     }

// }

// import java.util.*;

// public class L_DuplicateItem_13 {

//     public static boolean ContiansDuplicate(int nums[]) {

//         Arrays.sort(nums);
//         int n = nums.length;
//         for (int i = 0; i <=n-2; i++) {
//             if (nums[i] == nums[i + 1])
//                 return true;
//         }
//         return false;
//     }

//     public static void main(String args[]) {

//         int nums[] = { 1, 2, 3 };
//         System.out.println(ContiansDuplicate(nums));
//     }

// }

class L_DuplicateItem_13 {
    public static boolean duplicate(int arr[]) {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            max=Math.max(arr[i],max);
        }

        int hash[] = new int[max + 1];
        for (int i = 0; i < arr.length; i++) {
            hash[arr[i]]++;
        }
       
        for (int i = 0; i < hash.length; i++) {
            if (hash[i] > 1) {
                return true;
            }
        }
        return false;

    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3,3,3,9};
        System.out.println(duplicate(arr));
    }
}
