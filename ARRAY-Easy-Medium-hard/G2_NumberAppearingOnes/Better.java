package G2_NumberAppearingOnes;

public class Better {

    public static int once(int arr[]) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);     // because the ele of the arr becomes the index in the hash array.. thats why length should be the max ele in the array and +1 donno...
        }

        int hash[] = new int[max+1];

        for (int i = 0; i < arr.length; i++) {
            hash[arr[i]]++;
        }

        for (int i = 0; i < hash.length; i++) {
            if (hash[i] == 1) {
                return i;
            }
        }
        return -1; 
    }

    public static void main(String[] args) {
        int arr[] = { 1,1, 2, 2, 3, 4, 3,4 ,5};
        System.out.println(once(arr));

    }

}
