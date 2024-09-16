class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
      if(target >= letters[letters.length - 1]){
        return letters[0];
      }  

      int first = 0 ;
      int last = letters.length - 1;

      while(first <= last){
        int mid = first + (last - first)/2;
        if(target >= letters[mid]){
            first = mid + 1; 
        }else{
            last = mid - 1;
        }
      }
      return letters[first];
    }
}