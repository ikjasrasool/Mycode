class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> list = new ArrayList<>();
        int count=0;
        for(String s : words){
            if(s.indexOf(x)>=0){
                list.add(count);
            }
            count++;
        }
        return list;
    }
}