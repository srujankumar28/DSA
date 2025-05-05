// Input : s = "aababbcaacc" , k = 2

// Output : 6

// Explanation : The longest substring with at most two distinct characters is "aababb".

// The length of the string 6.

package E_LoneststringnonRep;
import java.util.*;
class Solution {
    public static int kDistinctChar(String s, int k) {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<s.length();i++){
            HashSet<Character> h=new HashSet<>();
            for(int j=i;j<s.length();j++){
                h.add(s.charAt(j));
                if(h.size()<=k){
                    max=Math.max(max,j-i+1);

                }else{
                    break;
                }
            }
        }
        return max;
    }
    public static void main(String[] args) {
        System.out.println(kDistinctChar("aababbcaacc",2));
    }
}