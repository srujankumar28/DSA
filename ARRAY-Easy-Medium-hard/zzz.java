import java.util.HashMap;

class zzz {
    public static int count(int arr[], int k) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        hm.put(0,1);
        int sum=0;
        int count=0;

        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(hm.containsKey(sum-k)){
              count+=hm.get(sum-k);
            }
            hm.put(sum,hm.getOrDefault(sum,0)+1);
            
        }
        return count;
        
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,1,2,1,1,1};
        System.out.println(count(arr,3));
    }
}