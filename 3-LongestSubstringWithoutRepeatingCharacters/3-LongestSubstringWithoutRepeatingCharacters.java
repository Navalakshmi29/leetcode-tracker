// Last updated: 08/07/2026, 21:54:27
class Solution {
    public int lengthOfLongestSubstring(String s) {
       int maxlen=0;
       for(int i=0;i<s.length();i++){
          int count=1;
        for(int j=i+1;j<s.length();j++){
            int charword=s.charAt(i);

            int dup=0;
            for(int k=i;k<j;k++){
                if(s.charAt(k)==s.charAt(j)){
                    dup=1;
                    break;
                }
            }
            if(dup==1){
                break;
            }
            else{
                count++;
            }
        }
            if(count>maxlen){
                maxlen=count;
            }
       }
            return maxlen;
        }
       } 