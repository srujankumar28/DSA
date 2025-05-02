

public class O_RemoveEven {

    public static int[] removeeven(int arr[]) {
        int oddcount = 0;
        int idx = 0;

        for (int i = 0; i < arr.length; i++) {  
            if ((arr[i] % 2) != 0) {
                oddcount++;
            }
        }

        // for(int num:arr){
        //     if(num%2!=0){
        //         ans.add(num);  // where ans is the arraylist which will save only odd numbers
        //     }
        // }

        int result[] = new int[oddcount];

        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] % 2) != 0) {
                result[idx] = arr[i];
                idx++;

            }
        }
        return result;

    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 5, 6, 7, 8 };
        removeeven(arr);
        int res[] = removeeven(arr);
        for (int e : res) {
            System.out.print(e + " ");
        }
    }

}


