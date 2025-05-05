public class F_Static {

    public static void main(String args[]) {
        student1 s1 = new student1();
        student1 s2 = new student1();
        student1 s3 = new student1();
        student1 s4 = new student1();
        s1.Schoolname = "Srujan";
        System.out.println(s1.Schoolname);
        System.out.println(s2.Schoolname);
        s3.Schoolname = "Viaks";
        System.out.println(s1.Schoolname);
        System.out.println(s4.Schoolname);

    }

}

class student1 {
    String name;
    int roll;
    static String Schoolname;
}
