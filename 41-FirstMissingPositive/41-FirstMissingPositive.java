// Last updated: 08/07/2026, 21:52:00
class Solution {
    public int firstMissingPositive(int[] nums) {
       Arrays.sort(nums);
       int ans=1;
       for(int num:nums){
        if(num==ans){
            ans++;
        }
       }
       return ans;
    }
}