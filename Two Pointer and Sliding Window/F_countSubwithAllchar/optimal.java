
package F_countSubwithAllchar;
import java.util.*;

public class optimal {
    public static int numberOfSubstrings(String s){
        int count=0;
        int hash[]=new int[3];
        hash[0]=-1;
        hash[1]=-1;
        hash[2]=-1;

        for(int i=0;i<s.length();i++){   
             hash[s.charAt(i)-'a']=i;
             if(hash[0]!=-1 && hash[1]!=-1 &&hash[2]!=-1){
                count=count+(1+ Math.min(hash[2],Math.min(hash[0],hash[1])));   // this is idx + 1
             }
        }
        return count;
    }
    public static void main(String[] args) {
        String s = "bbacba"; // we need to return the number of substring that is having a b and c.


        int ans = numberOfSubstrings(s);  // do the dry run on watch video.. u understand

        
        System.out.println("Number of substrings containing 'a', 'b', 'c' in \"" + s + "\" is: " + ans);
        
    }
    
}
