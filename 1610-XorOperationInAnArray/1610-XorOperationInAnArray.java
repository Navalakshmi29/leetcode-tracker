// Last updated: 08/07/2026, 21:42:49
class Solution {
    public int xorOperation(int n, int start) {
        int x=0;
        for(int i=0;i<n;i++){
            x^=start +2*i;
            
        }
        
         return x;
    }
}