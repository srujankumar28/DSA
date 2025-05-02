public class B_SecondLargest {

    public static int secondlargest(int arr[]) {
        int largest = arr[0];
        int secondlargest = Integer.MIN_VALUE;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {             // for the > replace it by < 
                secondlargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondlargest && arr[i]!=largest) {     // replace > by <
                secondlargest = arr[i];
            }

        }
        return secondlargest;
    }

    public static void main(String[] args) {
        int arr[] = { 3, 5, 2, 1, 8, 6 };
        System.out.println(secondlargest(arr));
    }
}

// import java.util.*;

// public class C_SecondLargest {
//     public static int secondlargest(int arr[]){
//         Arrays.sort(arr);
//         return arr[arr.length-2]; // applicable if and only if all the elements are distinct

//     }
//     public static void main(String[] args) {
//         int arr[] = { 3, 5, 2, 1, 8, 6 };
//         System.out.println(secondlargest(arr));
        
//     }
// }
