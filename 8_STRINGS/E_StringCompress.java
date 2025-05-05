public class E_StringCompress {

    public static String StringCompress(String str) {

        String newStr = "";
        for (int i = 0; i <= str.length() - 1; i++) {
            int count = 1;

            while (i <= str.length() - 2 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;

            }
            newStr += str.charAt(i);
            newStr += count;
            
        }
        return newStr;
    }

    public static void main(String args[]) {

        String str = "aaabbccch";
        System.out.println(StringCompress(str));
    }
}
