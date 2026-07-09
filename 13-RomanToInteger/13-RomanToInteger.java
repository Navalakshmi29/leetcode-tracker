// Last updated: 08/07/2026, 21:53:45
class Solution {
    public int romanToInt(String s) {
        int value[]=new int[128];
        value['I'] =1;
        value['V'] =5;
        value['X'] =10;
        value['L'] =50;
        value['C'] =100;
        value['D'] =500;
        value['M'] =1000;
        int total=0,prev=0;
        for(int i=s.length()-1;i>=0;i--){
            int current =value[s.charAt(i)];
            if(current<prev){
                total-=current;
            }
            else{
                total+=current;
            }
            prev=current;
        }
        return total;
    }
            
                

        } 
