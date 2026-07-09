// Last updated: 08/07/2026, 21:40:24
class Solution {
    public int minElement(int[] nums) {
        int n=nums.length;
        int num=0;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            num=nums[i];
            int sum=0;
            while(num>0){
            sum+=num%10;
            num=num/10;
            }
            if(sum<min){
               min=sum;
            }
        }
        return min;
        
        }
    }
