public class D_CopyConstructor {

    public static void main(String args[]) {

        person s1 = new person();
        s1.name = "Srujan";
        s1.roll = 123;
        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 80;

        person s2 = new person(s1); // COPY CONSTRUCTOR

        s1.marks[2] = 100; // AFTER COPY WE HAD DONE THIS..BUT BECAUSE OF this.marks = s1.marks; THIS LINE
                           // OUTPUT WILL BE
                           // 100,90,100(VALUE CHANGED) // SHALLOW CONSTRUCTOR
                           // FOR COPY CONSTRUCTOR THIS LINE DOES NOT MAKE AMY CHANGE

        System.out.println(s2.marks[0]);
        System.out.println(s2.marks[1]);
        System.out.println(s2.marks[2]);

    }
}

class person {
    String name;
    int roll;
    String password;
    int marks[];

    // SHALLOW COPY CONSTRUCTOR

    // person(person s1) {
    // marks = new int[3];
    // this.name = s1.name;
    // this.roll = s1.roll;
    // this.marks = s1.marks; // COPY THE MARKS LIKE THIS IS COPY THE REFERENCE..SO
    // }

    // DEEP COPY CONSTRUCTOR

    person(person s1) {
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        for (int i = 0; i < marks.length; i++) { // this.marks = s1.marks; INSTEAD OF THIS LINE
            this.marks[i] = s1.marks[i];
        }

    }

    person() {
        marks = new int[3];
    }

}
