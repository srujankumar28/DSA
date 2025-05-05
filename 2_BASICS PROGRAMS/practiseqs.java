// AVERAGE OF 3 NUMBERS
 /*import java.util.*;


public class practiseqs {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        float avg=(a+b+c)/3;
        System.out.println("average is" + avg);
        }

    
}   */
  

// AREA OF THE SQUARE
// import java.util.*;


// public class practiseqs {
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//        System.out.println("Enter the Number:");
//          int a=sc.nextInt();
//          int area= (a*a);
//          System.out.println(area);
//     }
// }




// TOTAL COST OF 3 INPUTS AS FLOAT AND PRINTING THE SUM and include 18% gst

import java.util.*;


public class practiseqs {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        double a=sc.nextInt();
        double b=sc.nextInt();
        double c=sc.nextInt();
        double sum=a+b+c;
        System.out.println(sum);
        double with_gst=sum+ (sum*0.18);
        System.out.println(with_gst);
    }
}
