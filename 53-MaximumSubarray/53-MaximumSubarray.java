// Last updated: 08/07/2026, 21:51:17
class Solution {
    public int maxSubArray(int[] nums) {
        int curr=0;
        int maxs=nums[0];
        for(int num:nums){
            curr+=num;
            maxs=Math.max(curr,maxs);
            if(curr<0){
                curr=0;
            }
        }
        return maxs;
    }
}