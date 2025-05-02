package M_SqaureRoot;

public class brute {
    public static int sqrt(int n) {
        int ans = 1;

        for (int i = 1; i < n; i++) {
            if (i * i <= n) {
                ans = i;
                continue;

            } else {
                break;

            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(sqrt(28));
    }

}
