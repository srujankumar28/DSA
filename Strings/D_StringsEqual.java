class Solution {
    public boolean rotateString(String s, String goal) {
       
        return (s + s).contains(goal);
    } 
}

//Input: s = "abcde", goal = "cdeab"  // should be rotated in the proper manner
// Output: true
// Example 2:

// Input: s = "abcde", goal = "abced"
// Output: false
 