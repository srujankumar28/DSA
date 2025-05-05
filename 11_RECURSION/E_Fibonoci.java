public class E_Fibonoci {

    public static int FibonociNum(int n) {
        if (n == 0 || n == 1) {
            return n;
        }

        int fb1 = FibonociNum(n - 1);
        int fb2 = FibonociNum(n - 2);
        int fb = fb1 + fb2;
        return fb;
    }

    public static void main(String args[]) {
        int n = 8;
        System.out.println(FibonociNum(8));
    }

}
