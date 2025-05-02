package N_NthRootOfInteger;

public class brute {
    public static int Nthroot(int m, int n) {
        for (int i = 1; i < n; i++) {
            if (Math.pow(i, m) == n) {
                return i;
            } else if (Math.pow(i, m) > n) {
                break;
            }

        }
        return -1;

    }

    public static void main(String[] args) {
        System.out.println("Respective root = "+Nthroot(3, 27));
    }

}
