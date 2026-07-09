// Last updated: 08/07/2026, 21:42:24
class Solution {
    public boolean checkIfPangram(String sentence) {
         String word=sentence.toLowerCase();
        for(char ch='a';ch<='z';ch++){
            if(!word.contains(String.valueOf(ch))){
                return false;

            }
        }
     return true;          
    }
}