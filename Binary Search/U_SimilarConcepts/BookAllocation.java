package U_SimilarConcepts;

import java.util.Arrays;

public class BookAllocation {
    public static int countStudents(int[] arr, int pages) {
        int n = arr.length;
        int students = 1;
        long pagesStudent = 0;
        for (int i = 0; i < n; i++) {
            if (pagesStudent + arr[i] <= pages) {
                pagesStudent += arr[i];
            } else {
                students++;
                pagesStudent = arr[i];
            }
        }
        return students;
    }

    public static int findPages(int[] arr, int n, int m) {
        if (m > n)
            return -1;

        int low = Arrays.stream(arr).max().getAsInt(); // int low=Integer.MIN_VALUE;
        // int high=Integer.MAX_VALUE;
        int high = Arrays.stream(arr).sum();

        while (low <= high) {
            int mid = (low + high) / 2;
            int students = countStudents(arr, mid);
            if (students <= m) { // means the pages u are assiging is low to the student, thats y the number of
                                 // students are becoming max,if u want to minimize the the students we need to
                                 // increase the number of pages.. thats y low=mid+1
                high = mid - 1;

            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    public static void main(String[] args) {
        int[] arr = { 25, 46, 28, 49, 24 };// we should allocate the given pages(arr) in such a way that each student
                                           // should get atleast one book and it should be in the continous order
                                           // too..each book should be allocated to only one student..you have to
                                           // allocate the book m students such that the max number of pages assigned to
                                           // a student is minimum
        int n = 5; // size of the array
        int m = 4; // max number of students
        int ans = findPages(arr, n, m);
        System.out.println("The answer is: " + ans);
    }
}
