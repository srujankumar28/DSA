// BRUTE FORCE

// public class I_power {

//     public static int Power(int a, int n) {
//         if (n == 0) {
//             return 1;

//         }
//         return a * Power(a, n - 1);

//     }

//     public static void main(String args[]) {
//         int a = 10;
//         int n = 2;
//         System.out.println(Power(a, n));
//     }

// }




// OPTIMIZED CODE

public class I_power {

    public static int Power(int a, int n) {
        if (n == 0) {
            return 1;

        }
        int halfpower = Power(a, n / 2);
        int square = halfpower * halfpower;
        if (n % 2 != 0) {
            square = a * square;
        }
        return square;

    }

    public static void main(String args[]) {
        int a = 10;
        int n = 2;
        System.out.println(Power(a, n));
    }
}
