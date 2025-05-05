package MergesortedWithoutExtraSpace;

public class brute {
    public static void merged(int arr1[], int arr2[]) {

        int i = 0;
        int j = 0;
        int k = 0;

        int n = arr1.length;
        int m = arr2.length;
        int ans[] = new int[n + m];
        while (i < n && j < m) {
            if (arr1[i] < arr2[j]) {
                ans[k] = arr1[i];

                i++;
                k++;

            } else {

                ans[k] = arr2[j];

                j++;
                k++;

            }
        }

        while (i < n) {
            ans[k] = arr1[i];

            i++;
            k++;

        }
        while (j < m) {
            ans[k] = arr2[j];

            j++;
            k++;

        }

        for (int a = 0; a < m + n; a++) {
            if (a < n) {
                arr1[a] = ans[a];
            } else {
                arr2[a - n] = ans[a];
            }

        }

    }

    public static void main(String[] args) {
        int arr1[] = { 2, 5, 6, 7 };
        int arr2[] = { 1, 3, 4, 8, 9, 10 };
        merged(arr1, arr2);
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
    }

}
