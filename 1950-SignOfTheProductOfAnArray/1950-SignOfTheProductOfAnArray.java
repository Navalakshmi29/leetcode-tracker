// Last updated: 08/07/2026, 21:42:17
class Solution {
    public int arraySign(int[] nums) {
        int negc=0;
        for(int i=0;i<nums.length;i++){
           if(nums[i]==0){
            return 0;
           }
           if(nums[i]<0){
            negc++;
           }
        }
        if(negc%2==0){
            return 1;
        }
        return -1;
    }
}