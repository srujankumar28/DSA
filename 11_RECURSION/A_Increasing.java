public class A_Increasing {
    public static void IncreasingNum(int n) {
        if (n == 10) {
            System.out.println(n);
            return;
        }
        System.out.println(n);
        IncreasingNum(n + 1);

    }

    public static void main(String args[]) {
        int n = 1;
        IncreasingNum(n);
    }
}
