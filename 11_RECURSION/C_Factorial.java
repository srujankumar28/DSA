public class C_Factorial {

    public static int FactorialNum(int n) {
        if (n == 0) {
            return 1;
        }

        int factorial = n * FactorialNum(n - 1);
        return factorial;

    }

    public static void main(String args[]) {
        int n = 4;
        System.out.println(FactorialNum(n));
    }

}
