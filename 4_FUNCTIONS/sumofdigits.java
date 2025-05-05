public class sumofdigits {

    public static void SumofDigit(int n){
        int sum=0;

        while (n>0) {
            int lastdigit=n%10;
            sum=sum+lastdigit;
            n=n/10;
            
        }
        System.out.println("Sum= "+ sum);

    }

    public static void main(String[] args) {
        int n=1234;
        SumofDigit(n);
        
    }
    
}
