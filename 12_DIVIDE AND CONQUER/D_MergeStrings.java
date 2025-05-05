public class D_MergeStrings {

    public static void PrintArr(String arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }

    public static boolean smaller(String a, String b) {
        for (int i = 0; i < Math.min(a.length(), b.length()); i++) {
            if (a.charAt(i) < b.charAt(i)) {
                return true;
            } else if (a.charAt(i) > b.charAt(i)) {
                return false;
            }
        }
        if (a.length() < b.length()) {
            return true;

        } else {
            return false;
        }
    }

    public static void mergeSort(String arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        int mid = (si + ei) / 2;
        mergeSort(arr, si, mid);
        mergeSort(arr, mid + 1, ei);
        merge(arr, si, mid, ei);
    }

    public static void merge(String arr[], int si, int mid, int ei) {
        String temp[] = new String[ei - si + 1];
        int i = si;
        int j = mid + 1;
        int k = 0;
        while (i <= mid && j <= ei) {
            if (smaller(arr[i], arr[j]) == true) {
                temp[k] = arr[i];
                i++;
            } else {
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

    }

    public static void main(String args[]) {
        String arr[] = { "monkey", "hello", "wow", "sexy" };
        mergeSort(arr, 0, arr.length - 1);
        PrintArr(arr);
    }
}