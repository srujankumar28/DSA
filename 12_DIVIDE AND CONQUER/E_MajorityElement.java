public class E_MajorityElement {

    public static int getcount(int arr[], int left, int right, int target) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                count++;
            }
        }
        return count;
    }

    public static int majority(int arr[], int left, int right) {
        if (left == right) {
            return arr[left];
        }
        int mid = (left + right) / 2;
        int ansA = majority(arr, left, mid);
        int ansB = majority(arr, mid + 1, right);
        int countA = getcount(arr, left, right, ansA);
        int countB = getcount(arr, left, right, ansB);
        if (countA > countB) {
            return ansA;
        } else {
            return ansB;
        }
    }

    public static void main(String args[]) {
        int arr[] = { 30, 30, 20, 30, 10, 10 };
        int ans = majority(arr, 0, arr.length - 1);
        System.out.println(ans);
    }

}
