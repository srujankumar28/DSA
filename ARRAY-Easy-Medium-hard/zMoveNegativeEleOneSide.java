
import java.util.*;

// Move all the negative elements to one side of the array 

public class zMoveNegativeEleOneSide {

    public static void main(String args[]) {
        int arr[] = { 5, 2, 7, -3, -6, -4 };
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
