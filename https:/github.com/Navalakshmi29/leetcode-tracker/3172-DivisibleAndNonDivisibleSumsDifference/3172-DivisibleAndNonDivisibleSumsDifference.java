// Last updated: 08/07/2026, 21:40:58
class Solution {
    public int differenceOfSums(int n, int m) {
        int div=0;
        int nond=0;
        for(int i=1;i<=n;i++){
            if(i%m==0){
                div+=i;
            }
            else{
                nond+=i;
            }
        }
        return nond-div;
    }
}