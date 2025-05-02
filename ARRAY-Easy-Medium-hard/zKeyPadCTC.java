public class zKeyPadCTC {
    public static String convert(String keypad[], String S){
        String str=S.toUpperCase();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' '){
                sb.append("0");

            }else{
                int diff=str.charAt(i)-'A';
                sb.append(keypad[diff]);
            }
            
        }
        return sb.toString();


    }
    public static void main(String[] args) {
        String[] keypad = {"2", "22", "222", "3", "33", "333", "4", "44"
        , "444", "5", "55", "555", "6", "66", "666", "7", "77", "777", "7777"
        , "8", "88", "888", "9", "99", "999", "9999"};
        String str="hello World";
        System.out.println(convert(keypad,str));

    }
    
}
