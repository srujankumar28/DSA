package Problems;

import java.util.*;

public class T_ExtPoint {
    public static void extpoint(int matrix[][], int dir, int i, int j) {
        while (true) {
            dir = (dir + matrix[i][j]) % 4;  
            if (dir == 0) {     // EAST
                j++;
            } else if (dir == 1) {    // SOUTH
                i++;
            } else if (dir == 2) {   // WEST
                j--;

            } else if (dir == 3) {    // NORTH
                i--;
            }
            if (i < 0) {
                i++;
                break;

            } else if (j < 0) {
                j++;
                break;
            } else if (i == matrix.length) {
                i--;
                break;

            } else if (j == matrix[0].length) {
                j--;
                break;
            }

        }

        System.out.println("Exit point " + "(" + i + "," + j + ")");

    }

    public static void main(String[] args) {
        int matrix[][] = { { 0, 0, 1, 0 },
                           { 1, 0, 0, 1 },
                           { 0, 0, 0, 1 },
                           { 1, 0, 1, 0 } };

        int dir = 0;  // INITIAL POSITION WILL BE EAST --> 0  
                      // EAST-->0
                      // SOUTH-->1  WEST--> 2  NORTH--> 3
        int i = 0;
        int j = 0;

        extpoint(matrix, dir, i, j);

    }
}
