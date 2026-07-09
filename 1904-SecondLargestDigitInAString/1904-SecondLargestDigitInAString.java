// Last updated: 08/07/2026, 21:42:30
class Solution {
    public int secondHighest(String s) {
        int f=-1;
        int sec=-1;
        for(char ch:s.toCharArray()){
            if(Character.isDigit(ch)){
                int num=ch-'0';
                if(num>f){
                    sec=f;
                    f=num;
                }
                else if(num>sec && num!=f){
                    sec=num;
                }
            }
        }
        return sec;
    }
}
