// Last updated: 08/07/2026, 23:28:28
class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        Arrays.sort(asteroids);
        long currmass=mass;
        for(int as:asteroids){
            if(currmass<as){
                return false;
            }
            currmass+=as;
        }
        return true;
    }
}