// Last updated: 08/07/2026, 23:28:12
class Solution {
    public int sumOfMultiples(int n) {
        int t=0;
        for(int i=2;i<=n;i++)
        {
            if(i%3==0||i%5==0||i%7==0)
            t+=i;
        }
        return t;
    }
}