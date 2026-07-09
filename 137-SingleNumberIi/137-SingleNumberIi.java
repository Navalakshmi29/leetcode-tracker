// Last updated: 08/07/2026, 21:48:00
class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
            
        }
        for(int num:nums){
           if(map.get(num)==1){
            return num;
           }
        }
        return -1;
    }
}