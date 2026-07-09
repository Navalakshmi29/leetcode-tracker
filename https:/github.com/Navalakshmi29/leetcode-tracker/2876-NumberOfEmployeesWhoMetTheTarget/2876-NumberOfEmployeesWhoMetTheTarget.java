// Last updated: 08/07/2026, 21:41:02
class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int c=0;
        for(int num:hours){
            
            if(num>=target){
                c++;
            }
            
        }
        return c;
    }
}