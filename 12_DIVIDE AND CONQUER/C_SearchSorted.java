public class C_SearchSorted {

    public static int Search(int arr[], int target, int si, int ei) {
        if (si > ei) {
            return -1;

        }
        int mid = (si + ei) / 2;
        if (arr[mid] == target) {
            return mid;
        }
        if (arr[si] <= arr[mid]) {
            if (arr[si] <= target && target <= arr[mid]) {
                return Search(arr, target, si, mid - 1);
            } else {
                return Search(arr, target, mid + 1, ei);
            }
        } else {
            if (arr[mid] <= target && target <= arr[ei]) {
                return Search(arr, target, mid + 1, ei);

            } else {
                return Search(arr, target, si, mid - 1);
            }
        }
    }

    public static void main(String args[]) {
        int arr[] = { 4, 5, 6, 7, 0, 1, 2, 3 };
        int target = 0;
        int idx = Search(arr, target, 0, arr.length - 1);
        System.out.println(idx);

    }

}
