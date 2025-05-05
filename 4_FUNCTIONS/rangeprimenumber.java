import java.util.*;

import org.w3c.dom.ranges.Range;

public class rangeprimenumber {

    public static boolean isPrime(int n) {
        for (int i = 2; i <n; i++) {
            if (n % i == 0) {
                return false;

            }
        }
        return true;
    }

    public static void RangePrime(int n) {
        
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.println(i + " ");
            }
        }
    }

    public static void main(String[] args) {

        int n=20;
        RangePrime(n);

    }
}