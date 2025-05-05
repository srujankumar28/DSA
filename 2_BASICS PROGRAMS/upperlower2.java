public class upperlower2 {

    public static void main(String[] args) {

        String str1 = "Great Power";
        String newStr="";

        for (int i = 0; i < str1.length(); i++) {
            char ch=str1.charAt(i);

            if (Character.isLowerCase(ch)) {

                newStr+= Character.toUpperCase(ch);
            }

            else if (Character.isUpperCase(ch)) {

                newStr+= Character.toLowerCase(ch);
            }
        }
        System.out.println("String after case conversion : " + newStr);
    }
}

