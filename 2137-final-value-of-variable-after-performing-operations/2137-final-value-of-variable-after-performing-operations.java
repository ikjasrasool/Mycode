class Solution {
    public int finalValueAfterOperations(String[] arr) {
        int sum =0 ; 
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i].charAt(1)=='+') {
                sum += 1;
            }
            else 
                sum -= 1;
     }
     return sum ; 
    
    }
}