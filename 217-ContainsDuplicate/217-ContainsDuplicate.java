// Last updated: 08/07/2026, 21:46:21
class Solution {
    public boolean containsDuplicate(int[] nums) {
       HashSet<Integer>set=new HashSet<>();
       for(int num:nums){
        if(!set.add(num)){
            return true;
        }
       }      
            return false;
    }
}