package O_KoKoBanana;

// RETURN THE MIN INT K SUCH THAT KOKO CAN EAT ALL THE BANANAS WITHING H HOURS  //  K->BANANA/HOUR

public class brute {

    public static int findMax(int banana[]) {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < banana.length; i++) {
            max = Math.max(max, banana[i]);
        }
        return max;
    }

    public static double calcTotal(int banana[], int hourly) {
        double total = 0;
        for (int i = 0; i < banana.length; i++) {
            total += Math.ceil((double) banana[i] / (double) hourly);

        }
        return total;
    }

    public static int CocoBanana(int banana[], int hrs) {
        int maxi = findMax(banana);
        double totalhrs = 0;

        for (int i = 1; i <= maxi; i++) {
            totalhrs = calcTotal(banana, i);
            if (totalhrs <= hrs) {
                return i;
            }

        }
        return -1;// dummy statement never executed

    }

    public static void main(String[] args) {
        int banana[] = { 7, 15, 6, 3 };
        int h = 8; // mAx num of hours she can take to eat all bananas
        System.out.println(CocoBanana(banana, h));  // ans we got is 5 tht means 5 banana per hour and for 7 banana she will be taking 2hrs and for 15 bananas shw will be taking 3 hrs exacly and so on....

    }

}
