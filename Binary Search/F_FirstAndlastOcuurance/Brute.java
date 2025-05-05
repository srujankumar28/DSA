package F_FirstAndlastOcuurance;

public class Brute { // brute force
    public static int[] occurance(int arr[], int target) {
        int first = -1;
        int last = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                if (first == -1) {
                    first = i;

                }
                last = i;
            }
        }
        return new int[] { first, last };
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 8, 8, 11, 13 };
        int ans[] = occurance(arr, 8);
        System.out.print("First Occurance= " + ans[0] + "  last Occurance= " + ans[1]);

    }

}
