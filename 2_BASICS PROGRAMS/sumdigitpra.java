public class sumdigitpra {

    public static int sumofdigit(int n) {
        int sum = 0;
        while (n > 0) {
            int lastdigit = n % 10;
            sum = sum + lastdigit;
            n = n / 10;

        }
        return sum;
    }

    public static void main(String[] args) {
        int n = 1234;
        System.out.println(sumofdigit(n));
    }

}
