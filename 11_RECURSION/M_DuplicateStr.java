public class M_DuplicateStr {

    public static void Duplicate(String str, int i, StringBuilder newStr, boolean map[]) {

        if (i == str.length()) {
            System.out.println(newStr);
            return;
        }
        char currChar = str.charAt(i);
        if (map[currChar - 'a'] == true) {
            Duplicate(str, i + 1, newStr, map);

        } else {
            map[currChar - 'a'] = true;
            Duplicate(str, i + 1, newStr.append(currChar), map);
        }

    }

    public static void main(String args[]) {
        String str = "apppnnacollege";
        boolean map[] = new boolean[26];
        StringBuilder newStr = new StringBuilder("");
        Duplicate(str, 0, newStr, map);

    }

}
