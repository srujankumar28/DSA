package K_SingleEleInSortedArray;

public class brute {
    public static int single(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            if (arr.length == 1) {
                return arr[0];
            }

            if (i == 0) {
                if (arr[i] != arr[i + 1]) {
                    return arr[0];
                }
            } else if (i == arr.length - 1) {
                if (arr[i] != arr[i - 1]) {
                    return arr[arr.length - 1];
                }
            } else {
                if ((arr[i] != arr[i - 1]) && (arr[i] != arr[i + 1])) {
                    return arr[i];
                }
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 1, 2, 2, 3, 4, 4 };
        System.out.println(single(arr));
    }

}
