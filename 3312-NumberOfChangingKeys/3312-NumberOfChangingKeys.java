// Last updated: 08/07/2026, 23:27:45
class Solution {
    public int countKeyChanges(String s) {
        String st=s.toLowerCase();
        int c=0;
        for(int i=0;i<st.length()-1;i++){
            if(st.charAt(i)!=st.charAt(i+1)){
                c++;
                
            }
        }
        return c;
    }
}