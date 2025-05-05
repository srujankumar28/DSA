import java.util.*;

public class swap{

    public static void swapNumber(int a,int b){
        int temp=a;
        a=b;
        b=temp;
        System.out.println(a);
        System.out.println(b);


    }

    public static void main(String args[]){

        int a=10;
        int b=20;
        swapNumber(a, b);
        System.out.println(a);  // 10
        System.out.println(b); // 20


    }
}