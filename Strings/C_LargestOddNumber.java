public class C_LargestOddNumber {
    public static String largestOddNumber(String num) {
        for (int i = num.length() - 1; i >= 0; i--) {
            if ((num.charAt(i) - '0') % 2 == 1) { // Check if the digit is odd
                return num.substring(0, i + 1); // Return substring up to this odd digit
            }
        }
        return ""; // No odd digit found
    }

    public static void main(String[] args) {
        System.out.println(largestOddNumber("52"));     // Output: "5"   // 452-> 45
        System.out.println(largestOddNumber("4206"));   // Output: ""
        System.out.println(largestOddNumber("35427"));  // Output: "35427"
    }
}
