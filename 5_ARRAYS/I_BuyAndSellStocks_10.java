// import java.util.*;;

// public class I_BuyAndSellStocks_10 {

//     public static int MaxProfit(int sell[]) {

//         int buyStock = Integer.MAX_VALUE; // min we r finding because to get the profit, the buystock value should be low
//         int MaxProfit = 0;

//         for (int i = 0; i < sell.length; i++) {

//             if (buyStock < sell[i]) {
//                 int profit = sell[i] - buyStock;
//                 MaxProfit = Math.max(profit, MaxProfit);
//             } else {
//                 buyStock = sell[i];
//             }

//         }

//         return MaxProfit;

//     }

//     public static void main(String args[]) {

//         int sell[] = { 7, 1, 5, 3, 6, 4 };
//         System.out.println( MaxProfit(sell));

//     }
// }

class z {
    public static int MaxProfit(int arr[]) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            min = Math.min(min, arr[i]);
            max = Math.max(max, arr[i] - min);

        }
        return max;
    }

    public static void main(String args[]) {

        int sell[] = { 7, 1, 5, 3, 6, 4 };
        System.out.println(MaxProfit(sell));

    }
}