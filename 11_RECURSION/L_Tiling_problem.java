public class L_Tiling_problem {

    public static int TotalWays(int n) {
        if (n == 0 || n == 1) {
            return 1;

        }
        int f1 = TotalWays(n - 1);
        int f2 = TotalWays(n - 2);
        return f1 + f2;

    }

    public static void main(String args[]) {
        System.out.println(TotalWays(3));

    }

}
