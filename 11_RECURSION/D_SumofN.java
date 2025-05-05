public class D_SumofN {

    public static int calcSum(int n){
        if(n==1){
            return 1;
        }

        int sum= n + calcSum(n-1);
        return sum;

    }
     public static void main(String args[]){
        int n=5;
        System.out.println(calcSum(n));
     }
}
