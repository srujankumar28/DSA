import java.util.*;

public class O_minmax {

    public static void Minmax(int arr[]) {
        Arrays.sort(arr);
        int min = arr[0];
        int max = arr[arr.length - 1];
        System.out.println("The smallest element is " + min);
        System.out.println("The largest element is " + max);

    }

    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 4, 5 };
        Minmax(arr);
    }

}
