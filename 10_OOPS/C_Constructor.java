import javax.swing.text.Style;

public class C_Constructor {

    public static void main(String args[]) {

        Student s1 = new Student();
        Student s2 = new Student("Srujan");
        Student s3 = new Student(123);
        // System.out.println(s1);
        System.out.println(s2.name);
        System.out.println(s3.roll);

    }
}

class Student {
    String name;
    int roll;

    Student() {                                // NON PARAMETERIZED CONSTRUCTOR
        System.out.println("CONSTRCTOR IS BEING CALLED");
    }

    Student(String name) {                       // PARAMETERIZED CONSTRUCTOR
        this.name = name;
    }

    Student(int roll) {    
        this.roll = roll;                         // PARAMETERIZED CONSTRUCTOR

    }

}