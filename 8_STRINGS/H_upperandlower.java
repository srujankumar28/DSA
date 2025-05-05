public class H_upperandlower {

    public static void main(String[] args) {

        String str1 = "Great Power";
        String newStr = "";

        for (int i = 0; i < str1.length(); i++) {

            if (Character.isLowerCase(str1.charAt(i))) {

                newStr += Character.toUpperCase(str1.charAt(i));
            }

            else if (Character.isUpperCase(str1.charAt(i))) {

                newStr += Character.toLowerCase(str1.charAt(i));
            }

        }
        System.out.println("String after case conversion : " + newStr);
    }
}
