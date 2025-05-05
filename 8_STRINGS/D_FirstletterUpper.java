// public class D_FirstletterUpper {

//     public static String upper(String str) {

//         StringBuilder sb = new StringBuilder("");
//         sb.append(Character.toUpperCase(str.charAt(0)));
//         for (int i = 1; i <= str.length() - 1; i++) {

//             if (str.charAt(i) == ' ') {
//                 sb.append((str.charAt(i)));

//                 i++;
//                 sb.append(Character.toUpperCase(str.charAt(i)));

//             } else {
//                 sb.append(str.charAt(i));
//             }
//         }
//         return sb.toString();  // CONVERTS STRING BUILDER TO STRING
//     }

//     public static void main(String[] args) {
//         String str = "hi, srujan i am srujan";
//         System.out.println(upper(str));
//     }

// }

//-------------------------------------------------------------------------------------------------------------

public class D_FirstletterUpper {

    public static String upper(String str) {
        String str2 ="";

        char ch = Character.toUpperCase(str.charAt(0));
        str2 = str2 + ch;

        for (int i = 1; i <=str.length() - 1; i++) {
            if (str.charAt(i) == ' ') {
                str2 += str.charAt(i);
                i++;
                str2 += Character.toUpperCase(str.charAt(i));
            } else {
                str2 += str.charAt(i);
            }
            
        }
        return str2;
    }

    public static void main(String[] args) {
        String str = "abc hhhd hhhdh mmdm";
        System.out.println(upper(str));
    }

}
