// Last updated: 08/07/2026, 21:50:50
class Solution {
    public int climbStairs(int n) {
        if(n==1){
            return 1;
        }
        int first=1;
        int second=2;
        int res=second;
        for(int i=3;i<=n;i++){
            res=first+second;
            first=second;
            second=res;
        }
        return res;
    }
}