import java.util.*;

public class A_basicArray_1 {

    // PASS BY REFERENCES

    public static void Update(int marks[]) {

        for (int i = 0; i < marks.length; i++) {
            marks[i] = marks[i] + 1;

        }

    }

    public static void main(String args[]) {

        int marks[] = { 88, 22, 44 };
        Update(marks);
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);

        }
    }
}