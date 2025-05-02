public class C_ArraySortedNot {
    public static boolean sortedOrNot(int arr[]) {
        for (int i = 1; i <= arr.length - 1; i++) {
            if (arr[i] < arr[i - 1]) {
                return false;

            }
        }
        return true;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 5, 6, 7, 7, 7, 6 };

        System.out.println(sortedOrNot(arr));

    }

}
