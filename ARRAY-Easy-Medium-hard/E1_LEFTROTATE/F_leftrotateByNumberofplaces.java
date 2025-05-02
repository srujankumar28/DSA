package E1_LEFTROTATE;

public class F_leftrotateByNumberofplaces {
    public static void rotate(int arr[], int k) {
        k = k % arr.length;
        int temp[] = new int[k];
        for (int i = 0; i < k; i++) { // starting element is placed
            temp[i] = arr[i];
        }

        for (int i = k; i < arr.length; i++) {
            arr[i - k] = arr[i]; // shifting back the elements by k positions
        }

        for (int i = arr.length - k; i < arr.length; i++) {
            arr[i] = temp[i - (arr.length - k)];

        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    public static void main(String[] args) {
        int arr[] = { 2, 3, 4, 5, 6, 7, 8 };
        rotate(arr, 3);
    }

}
