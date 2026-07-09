// Last updated: 08/07/2026, 21:42:42
class Solution {
    public String restoreString(String s, int[] indices) {
        char[] str=new char[s.length()];
        for(int i=0;i<s.length();i++){
            str[indices[i]]=s.charAt(i);
 
            
    }
    String str2=new String(str);
    return str2;
}
}