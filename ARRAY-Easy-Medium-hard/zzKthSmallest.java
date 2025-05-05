
import java.util.*;

// KTH SMALLEST ELEMENT 

public class zzKthSmallest {

    public static int smallest(int arr[], int k) {
        Arrays.sort(arr);
        return arr[k - 1];

    }

    public static void main(String args[]) {
        int arr[] = { 2, 3, 5, 7, 9 };
        int k = 3;
        System.out.println(smallest(arr, k));

    }

}
