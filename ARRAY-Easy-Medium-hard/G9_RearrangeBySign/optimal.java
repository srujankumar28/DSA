package G9_RearrangeBySign;



public class optimal {
    public static int[] rearrange(int arr[]) {
        int posIdx = 0;
        int negIdx = 1;
        int ans[] = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                ans[negIdx] = arr[i];
                negIdx += 2;

            } else {
                ans[posIdx] = arr[i];
                posIdx += 2;
            }

        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = { 3, 1, -2, -5, 2, -4 };   // NUMBER OF POS AND NEG WILL BE SAME
        int res[] = rearrange(arr);
        for (int e : res) {
            System.out.print(e + " ");
        }
    }

}
