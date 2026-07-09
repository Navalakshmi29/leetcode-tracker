// Last updated: 08/07/2026, 21:44:03
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
       int c=0;
       int maxc=0;
       for(int num:nums){
         if(num==1){
             c++;
             maxc= Math.max(maxc,c);
         }
         else{
            c=0;
         }
       }
       return maxc;
    }
}