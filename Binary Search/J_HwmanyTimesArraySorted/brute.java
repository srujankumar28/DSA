package J_HwmanyTimesArraySorted;

public class brute {
    public static int hwMany(int arr[]){
        int index=0;
        int ans=arr[0]; // ans should be min to find the first elemnt in the array where there is a dip 
        // in this given array it is zero
        for(int i=0;i<arr.length;i++){
            if(arr[i]<ans){
                return i;
            }
            
        }
        return index;
    }
    public static void main(String[] args) {
        int arr[]={5,6,7,0,1,2,3};
        System.out.println(hwMany(arr));
        
    }
    
}
