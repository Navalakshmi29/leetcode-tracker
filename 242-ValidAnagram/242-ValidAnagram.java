// Last updated: 08/07/2026, 21:45:23
class Solution {
    public boolean isAnagram(String s, String t) {
       char[] n=s.toCharArray();
       char[] m=t.toCharArray();
       Arrays.sort(n);
       Arrays.sort(m);
       String str=new String(n);
       String str1=new String(m);
       if(str.equals(str1)){
             return true;
       }
       else{
        return false;
       }
    }
}