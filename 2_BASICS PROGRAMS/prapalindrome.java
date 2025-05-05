// public class prapalindrome {

//     public static boolean isPalindrome(String str){
//         for(int i=0;i<=str.length()/2;i++){
//             int n=str.length();
//             if(str.charAt(i)!=str.charAt(n-1-i)){
//                 return false;
//             }
//         }
//         return true;
//     }

//     public static void main(String[] args) {
//         String str="1110000111";
//         System.out.println(isPalindrome(str));
//     }
    
// }
public class prapalindrome {

    public static boolean isPalindrome(String str){
       int left=0;
       int right=str.length()-1;
       while(left<=right){
          if(str.charAt(left)!=str.charAt(right)){
            return false;
          }
          left++;
          right--;
       }
       return true;
    }

    public static void main(String[] args) {
        String str="01010101";
        System.out.println(isPalindrome(str));
    }
    
}

