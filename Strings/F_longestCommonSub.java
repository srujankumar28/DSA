import java.util.Arrays;

public class F_longestCommonSub {
    public static String common(String arr[]){
        String ans="";

        Arrays.sort(arr);

        String first=arr[0];
        String last=arr[arr.length-1];

        for(int i=0;i<Math.min(first.length(),last.length());i++){
            if(first.charAt(i)!=last.charAt(i)){
                return ans;
            }
            ans+=first.charAt(i);
        }
        return ans;
    }
    public static void main(String[] args) {
        String arr[]={"flow", "flight","flower"}; // {"car","dog", "ele"}-> empty string becuase nothing is common
        System.out.println(common(arr));
    }
    
}
