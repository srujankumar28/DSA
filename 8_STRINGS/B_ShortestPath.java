import java.util.*;

public class B_ShortestPath {

    public static double ShortestPath(String str) {

        int x = 0, y = 0;
        for (int i = 0; i < str.length(); i++) {
            char dir = str.charAt(i);
            if (dir == 'N') {
                y++;
            }
            if (dir == 'S') {
                y--;
            }
            if (dir == 'E') {
                x++;
            }
            if (dir == 'W') {
                x--;
            }
        }
        int x2 = x * x;
        int y2 = y * y;
        return Math.sqrt(x2 + y2);

    }

    public static void main(String args[]) {

        String str = "WNEENESENNN";
        System.out.println(ShortestPath(str));
    }

}
