public class H_lastOccur {

    public static int lastOccurance(int arr[], int key, int i) {

        if (i == arr.length) {
            return -1;
        }
        int isFound = lastOccurance(arr, key, i + 1);
        if (isFound == -1 && arr[i] == key) {
            return i;
        }
        return isFound;
    }

    public static void main(String atgs[]) {
        int arr[] = { 2, 3, 4, 5, 6, 2 };
        System.out.println(lastOccurance(arr, 2, 0));
    }

}
