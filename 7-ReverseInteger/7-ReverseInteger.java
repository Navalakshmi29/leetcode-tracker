// Last updated: 08/07/2026, 21:54:11
class Solution {
    public int reverse(int x) {

        int a=0;
        while(x!=0){
        int b = x%10;
        x = x/10;
        if(a > 2147483647/10 || (a == 2147483647/10 && b > 7)) return 0;
        if(a < -2147483648/10 || (a == -2147483648/10 && b < -8)) return 0;
        a = a * 10 + b;

        }
        return a;
    }
}

