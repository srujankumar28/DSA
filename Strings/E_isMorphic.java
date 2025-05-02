java.util.*;

class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashSet<Character> h=new HashSet<>();
        for(int i=0;i<s.length();i++){
            h.add(s.charAt(i));
        }
       HashSet<Character> k=new HashSet<>();
         for(int i=0;i<t.length();i++){
            k.add(t.charAt(i));
        }
        return h.size()==k.size();   
    }
}

//Input: s = "egg", t = "add"

// Output: true

// Explanation:

// The strings s and t can be made identical by:

// Mapping 'e' to 'a'.
// Mapping 'g' to 'd'.

// --------------------------------
// Input: s = "foo", t = "bar"

// Output: false

// Explanation:

// The strings s and t can not be made identical as 'o' needs to be mapped to both 'a' and 'r'.