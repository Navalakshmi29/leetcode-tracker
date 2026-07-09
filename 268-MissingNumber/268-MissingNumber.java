// Last updated: 08/07/2026, 21:44:59
class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int s=n*(n+1)/2;
        int sum=0;
        for(int nu:nums){
             sum+=nu;
        }
        return s-sum;
    }
}