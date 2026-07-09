// Last updated: 08/07/2026, 21:41:29
class Solution {
    public int findClosestNumber(int[] nums) {
       int mindist=Integer.MAX_VALUE;
       int index=-1;
       for(int i=0;i<nums.length;i++){
        int dist=Math.abs(nums[i])-0;
        if(dist<mindist)
       {
        mindist=dist;
        index=i;
       }
       else if(dist==mindist){
        index=nums[i]>nums[index]?i:index;
       }
       }
       return nums[index];

       
    }
}