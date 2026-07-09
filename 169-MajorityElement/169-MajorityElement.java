// Last updated: 08/07/2026, 21:46:59
class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int n=nums.length;
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
            if(map.get(num)>n/2){
                return num;
            }
        }
        return -1;
    }
}