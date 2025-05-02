package Problems;

public class Q_rightrotation {

    public static int[] rightrotation(int arr[], int k) {
        int result[] = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            int idx = (i + k) % arr.length;
            result[idx] = arr[i];
        }

        return result;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 3, 4, 5 };

        int res[] = rightrotation(arr, 3);
        for (int e : res) {
            System.out.print(e + " ");
        }

    }

}