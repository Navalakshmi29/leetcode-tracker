// Last updated: 08/07/2026, 21:41:42
class Solution {
    public int mostWordsFound(String[] sentences) {
     int max=0;
     for(String s : sentences){
      if (s.trim().isEmpty())
           continue;
     
     int w=s.trim().split("\\s+").length;
     max=Math.max(max,w);
     
     }
     return max;
        
    }
}