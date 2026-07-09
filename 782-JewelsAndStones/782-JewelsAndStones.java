// Last updated: 08/07/2026, 21:43:24
class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int count=0;
        for(char s:stones.toCharArray()){
            for(char j:jewels.toCharArray()){
                if(s==j){
                count++;
                break;
                }
            }
        }
        return count;
    }
}