// Last updated: 08/07/2026, 21:51:33
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans=new ArrayList<>();
        Map<String, List<String>> hm=new HashMap<>();
        for(int i=0;i<strs.length;i++){
            String s=strs[i];
            char[] arr=s.toCharArray();
            Arrays.sort(arr);
            String keyStr=new String(arr);
            if(!hm.containsKey(keyStr)){
               List<String> tt=new ArrayList<>();
                hm.put(keyStr,tt);
            }
            hm.get(keyStr).add(s);
        }
        for(String key : hm.keySet()){
            ans.add(hm.get(key));
        }
        return  ans;
    }
}