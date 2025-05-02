import java.util.*;

public class E3_Union{
    public static ArrayList<Integer> union(int arr[],int arr1[]){
        ArrayList<Integer> ans=new ArrayList<>();
        HashSet<Integer> h=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            h.add(arr[i]);
        }
        for(int i=0;i<arr1.length;i++){
            h.add(arr1[i]);
        }
        
        ans.addAll(h);

        return ans;

    }
    public static void main(String args[]){
        int arr[]={1,2,3,4,5};
        int arr2[]={2,3,6,7,8};
        ArrayList<Integer>ans=union(arr,arr2);
        for(int i:ans){
            System.out.print(i+" ");
        }
    }
}