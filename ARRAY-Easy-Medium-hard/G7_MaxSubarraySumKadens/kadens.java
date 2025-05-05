package G7_MaxSubarraySumKadens;

public class kadens {
    public static int largestsum(int arr[]){

    
    int sum=0;
    int max=Integer.MIN_VALUE;
    for(int i=0;i<arr.length;i++){
        sum+=arr[i];
        max=Math.max(sum,max);

        if(sum<0){
            sum=0;
        }


    }
    return max;
}
    
    public static void main(String[] args) {
        int arr[]={2,1,3,-3,9,-2,-3};
        System.out.println(largestsum(arr));
    }
    
}
