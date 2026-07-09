// Last updated: 08/07/2026, 23:28:21
class Solution {
    public int countDigits(int num) {
        int c=0;
         int org=num; 
         while(num>0){                             
        int dig=num%10;
        if(org%dig==0){
            c++;
        }
       
            num=num/10;
         }
        return c;
        }    
}