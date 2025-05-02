package G8_BuyAndSell;

public class optimal {
    public static int maxProfit(int sell[]){
        int buyPrice=Integer.MAX_VALUE;

        int maxVal=Integer.MIN_VALUE;
        for(int i=0;i<sell.length;i++){
            if(buyPrice<sell[i]){
                maxVal=Math.max(maxVal, sell[i]-buyPrice);
            }else{
                buyPrice=sell[i];
            }

        }
        return maxVal;
    }
    public static void main(String[] args) {
        int sell[]={1,2,3,4,5,6,2};
        System.out.print(maxProfit(sell));

    }
    
}

