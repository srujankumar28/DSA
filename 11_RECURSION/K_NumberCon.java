public class K_NumberCon {

    public static void NumberConv(int number) {
        String digits[] = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
        if (number == 0) {
            return;
        }
        int lastdigit = number % 10;
        NumberConv(number / 10);
        System.out.println(digits[lastdigit] + " ");
    }

    public static void main(String args[]) {
        int number = 1268;
        NumberConv(number);
    }

}
