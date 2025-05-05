//     Input : fruits = [1, 2, 1]

// Output : 3

// Explanation : We will start from first tree.

// The first tree produces the fruit of kind '1' and we will put that in the first basket.

// The second tree produces the fruit of kind '2' and we will put that in the second basket.

// The third tree produces the fruit of kind '1' and we have first basket that is already holding fruit of kind '1'. So we will put it in first basket.

// Hence we were able to collect total of 3 fruits.
package D_FruitsBasket;

import java.util.*;

class brute {
    public static int totalFruits(int[] fruits) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < fruits.length; i++) {
            HashSet<Integer> h = new HashSet();
            for (int j = i; j < fruits.length; j++) {
                h.add(fruits[j]);
                if (h.size() <= 2) {
                    max = Math.max(max, j - i + 1);
                } else {
                    break;
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 4, 2, 1, 1, 4, 5, 6 }; //u have 2 basckets,, and u need to pick fruits from the respective trees that is tree[0] and tree[1]........
        // u need to return the max number of fruits that is picked up
        // also in one bascket one type of fruit should only be there..and u need to pick the fruits continously
        // 1-> 1st bascket.. 2-. 2nd bascket... 2-> 2nd baskcet// 1-> 1st bascket... 1-> 1st bascket.. 4-> u cant place it any bascket,, becuase each and every bascket should contain only one type of fruit
        // u need to return the max fruits that is picked up by the two basckets
        
        System.out.println(totalFruits(arr));
    }
}
