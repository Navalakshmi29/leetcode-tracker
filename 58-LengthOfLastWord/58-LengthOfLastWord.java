// Last updated: 08/07/2026, 21:51:12
class Solution {
    public int lengthOfLastWord(String s) {
        int l=0;
        int i=s.length()-1;
        while(i>=0 && s.charAt(i)==' '){
            i--;
        }
        while(i>=0 && s.charAt(i)!=' '){
            l++;
            i--;
        }
        return l;
    }
}