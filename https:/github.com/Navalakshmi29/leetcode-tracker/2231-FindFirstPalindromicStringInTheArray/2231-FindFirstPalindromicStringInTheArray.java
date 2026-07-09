// Last updated: 08/07/2026, 21:41:34
class Solution {
    public String firstPalindrome(String[] words) {
        for(String w:words){
        int l=0;
        int r=w.length()-1;
        boolean ispalindrome=true;
        while(l<r){
            if(w.charAt(l)!=w.charAt(r)){
                  ispalindrome=false;
                  break;
            }
        
        l++;
        r--;
        }
        
         if(ispalindrome){
            return w;
         }
        }
         return "";
    }
}