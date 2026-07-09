// Last updated: 08/07/2026, 21:42:50
class Solution {
    public int subtractProductAndSum(int n) {
        int mul=1;
        int add=0;
        int diff=0;
        while(n>0){
        for(int i=0;i<n;i++){
            int dig=n%10;
            mul=mul*dig;
            add=add+dig;
             n=n/10;
        }
        }
        diff=mul-add;
        return diff;
    }
}