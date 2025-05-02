package G5_Sort_012;

public class optimal_dutch {
    // DUTCH ALGO FOR SORTING

    public static int[] sort(int arr[]) {
        int low = 0;
        int mid = 0;
        int high = arr.length - 1;

        while (mid <= high) {
            if (arr[mid] == 0) {
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                low++;
                mid++;

            } else if (arr[mid] == 1) {
                mid++;

            } else {
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = { 0, 0, 2, 0, 1, 0, 2, 1, 0 };
        int res[] = sort(arr);
        for (int e : res) {
            System.out.print(e + " ");
        }

    }
}
