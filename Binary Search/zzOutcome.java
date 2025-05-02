public class zzOutcome {

    public static String applyCaesarCipher(String input, int shift) {
        StringBuilder result = new StringBuilder();
        
        // Normalize shift to be within 0-25
        shift = shift % 26;

        // Process each character in the input string
        for (char c : input.toCharArray()) {
            if (Character.isUpperCase(c)) {
                // Shift uppercase letters
                char shiftedChar = (char) (((c - 'A' + shift) % 26 + 26) % 26 + 'A');
                result.append(shiftedChar);
            } else if (Character.isLowerCase(c)) {
                // Shift lowercase letters
                char shiftedChar = (char) (((c - 'a' + shift) % 26 + 26) % 26 + 'a');
                result.append(shiftedChar);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String input = "HelloWorld";
        int shift = 3;

        String encrypted = applyCaesarCipher(input, shift);
        System.out.println("Original: " + input);
        System.out.println("Encrypted: " + encrypted);
    }
}
