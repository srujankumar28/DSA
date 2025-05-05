import java.util.Scanner;

public class evensumoddsum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int evensum = 0;
        int oddsum = 0;

        while (true) {
            System.out.println("Enter the number");
            int n = sc.nextInt();
            if (n % 2 == 0) {
                evensum = evensum + n;

            } else {
                oddsum = oddsum + n;
            }

            System.out.println("Enter 1 for continue or 0 to stop");
            int choice = sc.nextInt();

            if (choice == 1) {
                continue;
            } else {
                break;
            }

        }

        System.out.println("Evesum = " + evensum);
        System.out.println("Oddsum = " + oddsum);
    }
}