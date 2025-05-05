public class J_AllOcuurance {

    public static void AllOccurance(int arr[], int key, int i) {

        if (i == arr.length) {
            return;
        }
        if (key == arr[i]) {
            System.out.println(i + " ");
        }
        AllOccurance(arr, key, i + 1);

    }

    public static void main(String args[]) {
        int arr[] = { 2, 3, 2, 3, 7, 8, 9, 2, 2, 2, 5, 2 };
        int key = 2;
        AllOccurance(arr, key, 0);

    }

}
