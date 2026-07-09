// Last updated: 08/07/2026, 21:49:03
class Solution {
    public int maxProfit(int[] prices) {
       int totalprofit=0;
       for(int i=0;i<prices.length-1;i++){
          int today=prices[i];
          int tmr=prices[i+1];
       if(today<tmr){
         int profit=tmr-today;
         totalprofit+=profit;
       }
       }
       return totalprofit;

    }
}
