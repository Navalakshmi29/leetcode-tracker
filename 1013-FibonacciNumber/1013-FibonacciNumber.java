// Last updated: 08/07/2026, 21:43:13
class Solution {
    public int fib(int n) {
        if(n<=1){
            return n;
        }
        int a=0;
        int b=1;
        for(int i=1;i<n;i++){
            int c=a+b;
            a=b;
            b=c;
        }
        return b;

        
    }
}