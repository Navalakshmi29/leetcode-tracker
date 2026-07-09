// Last updated: 08/07/2026, 21:42:39
class Solution {
    public int maximumWealth(int[][] arr) {
        // int add=0;
        // int add1=0;
        // int r=0;
        // for(int i=0;i<arr.length-1;i++){
        //     add+=arr[0][i];
        //     add1+=arr[1][i];
        // }
        // if(add==add1){
        //   r= add;
        // }
        // return r;
        
        int max=0;
        for(int i=0;i<arr.length;i++){
           int sum=0;
         for(int j=0;j<arr[i].length;j++){
             sum+=arr[i][j];
         }if(max<sum){
            max=sum;
         }

        }
        return max;
    }
}