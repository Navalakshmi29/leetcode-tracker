// Last updated: 08/07/2026, 21:45:33
class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n<=0){
            return false;
        }
        if(n==1){
            return true;
        }
        if(n%2!=0){
            return false;
        }
        return isPowerOfTwo(n/2);
    }
}