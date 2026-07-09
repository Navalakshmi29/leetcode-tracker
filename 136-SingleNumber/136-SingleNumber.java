// Last updated: 08/07/2026, 21:48:03
class Solution {
    public int singleNumber(int[] nums) {
      int ans=0; 
      for(int num:nums){
          ans=num^ans;
      }
      return ans;
}
}