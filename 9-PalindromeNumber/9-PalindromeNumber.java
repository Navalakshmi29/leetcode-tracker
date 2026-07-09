// Last updated: 08/07/2026, 21:53:57
class Solution {
    public boolean isPalindrome(int x) {
        int org=x;
        int rev=0;
        while(x>0){
            int d=x%10;
            rev=rev*10+d;
            x=x/10;
        }
        return org==rev;
    }
}