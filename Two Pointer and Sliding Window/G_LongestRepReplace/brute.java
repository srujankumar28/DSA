package G_LongestRepReplace;

public class brute {
    public static int max(String s, int k) {
        int maxLen = Integer.MIN_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < s.length(); i++) {
            int hash[] = new int[26];
            for (int j = i; j < s.length(); j++) {
                hash[s.charAt(j) - 'A']++;
                max = Math.max(max, hash[s.charAt(j) - 'A']);
                int change = j - i + 1 - max;
                if (change <= k) {
                    maxLen = Math.max(maxLen, j - i + 1);
                } else {
                    break;
                }

            }

        }
        return maxLen;
    }

    public static void main(String[] args) {
        String s = "AABABBA"; // we need to return the max length of substring which is obtained after k
                              // replacement and that substring should have repeating characters
                              // here the first 5 characters are AABAB here two B are replaced by A (2--> k) and the length is 5 which have all the characters as same and the length is 5 which is max
         int k = 2;
        System.out.println(max(s, k));

    }

}
