// // METHOD OVERLOADING

// import java.util.Calendar;

// public class F_Polymorphism {

//     public static void main(String args[]) {
//         calculator calc = new calculator();
//         System.out.println(calc.sum(2, 3));
//         System.out.println(calc.sum((float) 1.5, (float) 2.5));
//         System.out.println(calc.sum(2, 8, 4));

//     }

// }

// class calculator {
//     int sum(int a, int b) {
//         return a + b;
//     }

//     float sum(float a, float b) {
//         return a + b;
//     }

//     int sum(int a, int b, int c) {
//         return a + b + c;
//     }

// }

// METHOD OVERRIDING

class F_Polymorphism {
    public static void main(String args[]) {
        Deer d = new Deer();
        d.eat();

    }
}

class Animal1 {
    void eat() { // SAME FUNCTION
        System.out.println("Eats"); // DIFFERENT DEFINITION
    }
}

class Deer extends Animal1 {
    void eat() { // SAME FUNCTION
        System.out.println("Eats grass only"); // DIFFERENT DEFINITION
    }
}