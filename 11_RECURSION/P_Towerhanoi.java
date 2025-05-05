public class P_Towerhanoi {

    public static void TowerofHanoi(int n, String src, String helper, String dest) {

        if (n == 0) {
            return;
        }
        TowerofHanoi(n - 1, src, dest, helper);
        System.out.println("Move disk " + n + " From the rod " + src + " to the rod " + dest);
        TowerofHanoi(n - 1, helper, src, dest);
    }

    public static void main(String args[]) {
        int n = 3;
        TowerofHanoi(n, "A", "B", "C");

    }
}
