import java.security.Principal;

public class A_Array {

    public static void Array(int arr[], int i, int val) {
        if (i == arr.length) {
            PrintArray(arr);
            return;
        }
        arr[i] = val;
        Array(arr, i + 1, val + 1);
        arr[i] = arr[i] - 2;

    }

    public static void PrintArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");

        }
        System.out.println();
    }

    public static void main(String args[]) {

        int arr[] = new int[5];
        Array(arr, 0, 1);
        PrintArray(arr);
    }

}