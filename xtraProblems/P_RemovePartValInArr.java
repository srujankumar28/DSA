

public class P_RemovePartValInArr {
    // REMOVING THE PARTICULAR VALUE IN THE ARRAY
    public static void remove(int arr[], int val) {
        int i = 0;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != val) {
                arr[i] = arr[j];
                i++;
            }
        }
        // for(int num:arr){
        //     if(num!=val){
        //         ans.add(num); // 4 is not added that is nothing but the val mentioned and all the other numbers will be added to ans arraylist
        //     }
        // }

        for (int idx = 0; idx < i; idx++) {
            System.out.print(arr[idx] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 4, 4, 5 };
        remove(arr, 4);

    }

}

