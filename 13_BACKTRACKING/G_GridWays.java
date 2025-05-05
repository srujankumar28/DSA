public class G_GridWays {

    public static int Gridways(int i, int j, int m, int n) {
        if (i == m - 1 && j == n - 1) {
            return 1;
        } else if (i == m || j == n) {
            return 0;

        }

        int w1 = Gridways(i + 1, j, m, n);
        int w2 = Gridways(i, j + 1, m, n);
        return w1 + w2;

    }

    public static void main(String args[]) {
        int m = 3, n = 3;
        System.out.println("The number of the possible Gridways are " + Gridways(0, 0, m, n));
        ;
    }

}
