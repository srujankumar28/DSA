package E1_LEFTROTATE;

public class E_leftRotateArray {

    public static void leftrotate(int arr[]) {
        int temp = arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];

        }
        arr[arr.length - 1] = temp;
        for (int e : arr) {
            System.out.print(e + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        leftrotate(arr);

    }

}
