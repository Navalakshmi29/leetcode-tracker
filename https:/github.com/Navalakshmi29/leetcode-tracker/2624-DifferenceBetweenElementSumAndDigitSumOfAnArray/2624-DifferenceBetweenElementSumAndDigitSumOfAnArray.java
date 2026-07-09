// Last updated: 08/07/2026, 21:41:21
class Solution {
    public int differenceOfSum(int[] nums) {
        int add=0;
        int dig=0;
        for(int num:nums){
            add+=num;
            int temp=num;
        while(temp>0){
       
            dig+=temp%10;
            temp/=10;
        }
        }
        return add-dig;
    }
}