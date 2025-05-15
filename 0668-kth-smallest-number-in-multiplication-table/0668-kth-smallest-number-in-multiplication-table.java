// UPVOTE IF HELPED, THANKS
class Solution {
    public int findKthNumber(int m, int n, int k) {
        
       
      /*
         Points : value of 'k'th smallest number is never greater than 'k' itself...
      
      */
      
      int left = 1;
      int right = k;
      
      while(left < right){
        
          int mid = left + (right-left)/2;
        
          if(isPossible(mid, n, m, k))
            right = mid;
        
          else
            left = mid+1;
      }
      
      return left;
      
    }
  
  
    boolean isPossible(int mid, int n, int m, int k){
      
      int totalValues = 0;
      
      /*
        LET'S TAKE EXAMPLE:    1  2  3   (N = 3, M = 5)
                               2  4  6
                               3  6  9
                               4  8  12
                               5 10  15
                               
        for example LETS TAKE 12 AS MID, AND WE WANT TO FIND 14th POSITION NUMBER HERE, SO
        HOW MANY NUMBERS ARE <= 12 IN FIRST ROW??? 
        ANSWER = 3. HOW?  
        
        WHERE WILL 12 BE IN OUR FIRST ROW? (12/i)th position (12th postion in first row)
        
        HOW MANY NUMBERS ARE <= 12 IN SECOND ROW??? = 3 (== m), POSITION OF 12 = 6th (12/2) (i=2 HERE)
        HOW MANY NUMBERS ARE <= 12 IN THIRD ROW??? = 3 (== m), POSITION OF 12 = 4th (12/3)
        HOW MANY NUMBERS ARE <= 12 IN FOURTH ROW??? = 3 (m == mid/i here),  POSITION OF 12 = 3rd (12/4).
        HOW MANY NUMBERS ARE <= 12 IN FIFTH ROW??? = 2 (mid/i < m here),  POSITION OF 12 = 2nd (12/5).
        
        NOTE: DON'T GET CONFUSED BY POSITION OF 12 IN LAST ROW HERE. POSITION IS IMAGINARY WORD, 
        MAIN THING IS: HOW MANY NUMBERS ARE <= 12 IN THE CURRENT ROW, AND THAT IS 2 (5 AND 10) IN THE LAST ROW HERE.
        
        SO IF WE GENERALIZE IT, NUMBERS IN A ROW LESS THAN chosen "MID" = Math.min( mid/i, totalColumns(which is m))
        
        total numbers  <= 12 = 3 + 3 + 3 + 3 + 2  = 14 = K, so our answer is 12 .
        
        SO FOR THIS SPECIFIC INPUT (M = 5, N = 3, K = 14) OUR ANSWER IS "12".
        
      */
      for(int i = 1; i<=n; i++){     
        totalValues += Math.min(mid/i, m);
      }
  
      return totalValues >= k;
    }
}