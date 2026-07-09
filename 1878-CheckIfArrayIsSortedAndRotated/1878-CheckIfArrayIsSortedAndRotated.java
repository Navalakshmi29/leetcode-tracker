// Last updated: 08/07/2026, 21:42:36
class Solution {
    public boolean check(int[] nums) {
        int c=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]>nums[(i+1)%n]){
                c++;
            }
        }
        return c<=1;
    }
}