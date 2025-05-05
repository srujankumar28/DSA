package J_LongestConsecutiveSequence;

public class brute {

    public static boolean linearsearch(int arr[], int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return true;
            }
        }
        return false;
    }

    public static int longest(int arr[]) {
        int largest = 1;
       

        for (int i = 0; i < arr.length; i++) {
            int el = arr[i];
            int count = 1;
            while (linearsearch(arr, el + 1)) {
                el += 1;
                count += 1;

            }

            largest = Math.max(largest, count);

        }
        return largest;
    }

    public static void main(String[] args) {
        int arr[] = { 102, 4, 100, 1, 101, 3, 2, 1, 1 };
        System.out.println(longest(arr));
    }

}
