public class G_FirstOccur {

    public static int Occurance(int arr[], int key, int i) {

        if (i == arr.length) {
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }
        return Occurance(arr, key, i + 1);

    }

    public static void main(String args[]) {
        int arr[] = { 2, 4, 7, 5, 8, 5, 6, 0 };

        System.out.println(Occurance(arr, 0, 0));
    }

}
