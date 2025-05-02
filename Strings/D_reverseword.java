
import java.util.*;
// REVERSE WORD BY WORD IN STRING

public class D_reverseword {

    public static void main(String args[]) {
        String str = "This is java language";
        String word[] = str.split(" "); 
        // string words[]={"this", "is", "java", "language"};
        
        for (String s : word) {
            String rev="";
            for (int i = s.length() - 1; i >= 0; i--) {
                rev+=s.charAt(i);
                
            }
            System.out.print(rev+" ");

        }
    }
}
