import java.util.*;

public class C_binarySearch_4 {

    public static int binarySearch(int numbers[], int key) {
        int start = 0;
        int end = numbers.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (numbers[mid] == key) {
                return mid;
            }
            if (numbers[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }

        }
        return -1;
    }

    public static void main(String args[]) {
        int numbers[] = { 21, 23, 24, 25, 67, 89 };
        int key = 25;
        System.out.println("The index of the Searched Number is " + binarySearch(numbers, key));

    }

}
