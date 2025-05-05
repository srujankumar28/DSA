public class B_Decreasing {
    public static void DecreasingNum(int n) {
        if (n == 1) {
            System.out.println(n);
            return;
        }
        System.out.println(n);
        DecreasingNum(n - 1);

    }

    public static void main(String args[]) {
        int n = 10;
        DecreasingNum(n);
    }
}