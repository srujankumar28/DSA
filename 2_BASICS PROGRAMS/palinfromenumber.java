public class palinfromenumber {

    public static boolean isPalindrome(int n) {
        int number = n;
        int reverse = 0;
        while (n > 0) {
            int lastdigit = n % 10;
            reverse = reverse * 10 + lastdigit;
            n = n / 10;

        }
        return reverse == number;

    }

    public static void main(String[] args) {
        int n = 121;

        System.out.println(isPalindrome(n));
    }

}
