public class palindrome2 {
    public static boolean ispal(int n) {
        String str = String.valueOf(n);

        for (int i = 0; i < str.length() / 2; i++) {

            int size = str.length();
            if (str.charAt(i) != str.charAt(size - 1 - i)) {
                return false;
            }

        }
        return true;
    }

    public static void main(String[] args) {
        int n = 11221;
        System.out.println(ispal(n));
    }

}
