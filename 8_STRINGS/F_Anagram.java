import java.util.*;

public class F_Anagram {

    public static boolean anagram(String str1, String str2) {
        String strLower1 = str1.toLowerCase();
        String strLower2 = str2.toLowerCase();
        

        if (strLower1.length() == strLower2.length()) {

            char strLow1[] = strLower1.toCharArray();
            char strLow2[] = strLower2.toCharArray();

            Arrays.sort(strLow1);
            Arrays.sort(strLow2);
            return Arrays.equals(strLow1, strLow2);

        }
        return false;

    }

    public static void main(String args[]) {
        String str1 = "earth";
        String str2 = "heart";
        System.out.println(anagram(str1, str2));
    }

}
