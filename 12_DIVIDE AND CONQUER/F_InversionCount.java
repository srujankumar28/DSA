public class F_InversionCount {

    public static int mergeSort(int arr[], int si, int ei) {
        if (si >= ei) {
            return 0;
        }
        int ans = 0;
        int mid = (si + ei) / 2;
        ans += mergeSort(arr, si, mid);
        ans += mergeSort(arr, mid + 1, ei);
        ans += merge(arr, si, mid, ei);
        return ans;
    }

    public static int merge(int arr[], int si, int mid, int ei) {
        int temp[] = new int[ei - si + 1];
        int i = si;
        int j = mid + 1;
        int k = 0;
        int pairs = 0;
        while (i <= mid && j <= ei) {
            if (arr[i] <=arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                pairs += (mid - i + 1);
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        while (i <= mid) {

            temp[k] = arr[i];
            i++;
            k++;

        }

        while (j <= ei) {
            temp[k] = arr[j];
            j++;
            k++;

        }

        for (k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
        return pairs;

    }

    public static void main(String args[]) {
        int arr[] = { 2,6,4,1,3,5 };
        int ans = mergeSort(arr, 0, arr.length - 1);
        System.out.println(ans);
    }
}