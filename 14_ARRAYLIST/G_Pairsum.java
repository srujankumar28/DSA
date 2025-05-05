// import java.util.*;

// public class G_Pairsum {

//     public static boolean sum(ArrayList<Integer> list, int target) {
//         for (int i = 0; i < list.size(); i++) {
//             for (int j = i + 1; j < list.size(); j++) {
//                 if (list.get(i) + list.get(j) == target) {
//                     return true;

//                 }
//             }

//         }
//         return false;
//     }

//     public static void main(String args[]) {

//         ArrayList<Integer> list = new ArrayList<>();
//         list.add(1);
//         list.add(2);
//         list.add(3);
//         list.add(4);
//         list.add(5);
//         list.add(5);

//         int target = 5;

//         System.out.println(sum(list, target));
//     }

// }

//---------------------------------------------------------------------------------------------------------------------------------------------------

// TWO POINTERS APPROACH

// import java.util.*;

// public class G_Pairsum {

//     public static boolean Sum(ArrayList<Integer> list, int target) {

//         int start = 0;
//         int end = list.size() - 1;
//         while (start != end) {
//             if (list.get(start) + list.get(end) == target) {
//                 return true;
//             }

//             if (list.get(start) + list.get(end) < target) {
//                 start++;
//             } else {
//                 end--;
//             }
//         }
//         return false;
//     }

//     public static void main(String args[]) {
//         ArrayList<Integer> list = new ArrayList<>();
//         list.add(1);
//         list.add(2);
//         list.add(3);
//         list.add(4);
//         list.add(5);

//         int target = 9; // two sum problem.. 
//         System.out.println(Sum(list, target));
//     }
// }

//-----------TWO SUM IN ARRAY-------------------------------------------------------------

class G_Pairsum {
    public static boolean twoSum(int arr[], int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            if (arr[low] + arr[high] == target) {
                return true;
            }
            if (arr[low] + arr[high] < target) {
                low++;
            } else {
                high--;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        System.out.println(twoSum(arr, 9));
    }
}
