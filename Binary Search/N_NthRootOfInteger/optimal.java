package N_NthRootOfInteger;

public class optimal {
    public static int root(int root, int num) {
        int low = 0;
        int high = num;
        int ans = -1;
        while (low <= high) {
            int mid = (low + high) / 2;

            if (Math.pow(mid, root) <= num) {
                ans = mid;
                low = mid + 1;

            } else {
                high = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {

        System.out.println(root(2, 49)); // if not exists return -1

    }

}
