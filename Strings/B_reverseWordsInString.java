import java.io.*;

class B_reverseWordsInString {
    static public String result(String s) {
        String temp = "";
        String ans = "";

        // Iterate the string and keep on adding to form a word
        // If empty space is encountered then add the current word to the result
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                temp += s.charAt(i);
            } else if (s.charAt(i) == ' ') {
                if (ans.isEmpty()) { // first word to enter the ans..
                    ans = temp;

                } else {
                    ans = temp + " " + ans; // already atleast one word is entered.. so to enter the next word..

                }
                temp = "";
            }

        }

        // (Last word is added)
        // if (!temp.equals("")) {
        if (ans.isEmpty()) { // first word to enter the ans..
            ans = temp;

        } else {
            ans = temp + " " + ans; // already atleast one word is entered.. so to enter the next word..

        }

        return ans;
    }

    public static void main(String[] args) {
        String st = "TUF is great for interview preparation";
        System.out.println("Before reversing words: ");
        System.out.println(st);
        System.out.println("After reversing words: ");
        System.out.print(result(st)); // preparation interview for great is TUF
    }
}