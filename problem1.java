import java.util.HashMap;

import G4_TwoSum.hashing_optimal_returnIdx;

public class problem1 {

    public static void main(String[] args) {
       int arr[]={1,6,7,4,1,2,7,1,5,6};
       HashMap<Integer,Integer> hm=new HashMap<>();
       for(int i=0;i<arr.length;i++){
        hm.put(arr[i],hm.getOrDefault(arr[i],0 )+1);
       }

       hm.forEach((key,value)->
       System.out.println(key + "->"+value));

       int max=Integer.MIN_VALUE;
       for(int i=0;i<arr.length;i++){
          max=Math.max(max,arr[i]);
       }
       int hash[]=new int[max+1];
       
       int min=Integer.MAX_VALUE;
       for(int i=0;i<arr.length;i++){
        hash[arr[i]]++;
        if(hash[i]>1){
            min=Math.min(min,i);
        }
       }
    //    int min=Integer.MAX_VALUE;
    //    for(int i=0;i<hash.length;i++){
    //     if(hash[i]>1){
    //        min=Math.min(min, i);
    //     }
    //    }
       System.out.println(min);



    }
   

}
