import java.util.Scanner;

public class calc {
    public static int menu(int a, int b, int res) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(
                "Select 1 for addition \nSelect 2 for substarction \nSelect 3 for multiplication \nSelect 4 for division \n");

        System.out.println("Enter your value: ");
        int c = scanner.nextInt();
        switch (c) {
            case 1:
                addition(a, b, res);
                break;
            case 2:
                substraction(a, b, res);
                break;
            case 3:
                multiplication(a, b, res);
                break;
            case 4:
                division(a, b, res);
                break;
            default:
                System.out.println("invalid");
                break;
        }
        return 0;
    }

    public static void addition(int a, int b, int res) {
        res = a + b;
        System.out.println("Output is:" + res);
       
    }

    public static void substraction(int a, int b, int res) {
        res = a - b;
        System.out.println("Output is:" + res);
        
    }

    public static void multiplication(int a, int b, int res) {
        res = a * b;
        System.out.println("Output is:" + res);
        
    }

    public static void division(int a, int b, int res) {
        if (b == 0)
            System.out.println("Second value cant be zero Try Again");
        else {
            res = a / b;
            System.out.println("Output is:" + res);
        }
        
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the 1st number: ");
        int a = scanner.nextInt();
        System.out.println("Enter the 2nd number: ");
        int b = scanner.nextInt();
        int res = 0;
        menu(a, b, res);
    }
}