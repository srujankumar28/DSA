package G2_NumberAppearingOnes;

public class Optimal {
    public static int repeatedOnce(int arr[]){
        int ans=0;
        for(int i=0;i<arr.length;i++){
            ans=arr[i]^ans; // xor operation
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[]={1,1,2,2,3,4,4};
        System.out.println(repeatedOnce(arr));
    }
    
}
