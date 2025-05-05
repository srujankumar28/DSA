package G5_Sort_012;
public class better {            // BRUTE FORCE 

    public static int[] sort(int arr[]){
        int count1=0;
        int count2=0;
        int count3=0; // not required

        for(int i=0;i<arr.length;i++ ){
            if(arr[i]==0){
                count1++;
            }else if(arr[i]==1){
                count2++;
            }else{
                count3++;
            }
        }

        for(int i=0;i<count1;i++){
            arr[i]=0;
        }
        for(int i=count1;i<count1+count2;i++){
            arr[i]=1;
        }
        for(int i=count1+count2;i<arr.length;i++){
            arr[i]=2;
        }
        return arr;
    }
    public static void main(String[] args) {
        int arr[]={0,0,2,0,1,0,2,1,0};
        int res[]=sort(arr);
        for(int e:res){
            System.out.print(e+" ");
        }
    }

}


