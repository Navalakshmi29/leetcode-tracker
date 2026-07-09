// Last updated: 08/07/2026, 21:46:32
class Solution {
    public boolean isHappy(int n) {
        while(n!=1 && n!=4){
            int sum=0;
            while(n>0){
                sum+=(int)Math.pow(n%10,2);
                n=n/10;
            }
            n=sum;
        }
        if(n==1){
            return true;
        }
        return false;
    }
}