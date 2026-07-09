// Last updated: 08/07/2026, 23:27:52
class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
       List<Integer> list=new ArrayList<>();
       for(int i=0;i<words.length;i++){       
            if(words[i].indexOf(x)!=-1)
               list.add(i);
       }
       return list;
}
}