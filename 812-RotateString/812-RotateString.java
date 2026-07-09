// Last updated: 08/07/2026, 21:43:20
class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length()){
            return false;
        }
        return(s+s).contains(goal);
   
       
    }
}