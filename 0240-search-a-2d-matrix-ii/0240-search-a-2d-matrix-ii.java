class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows=0, colms=matrix[0].length-1;
        while(rows<matrix.length && colms>=0){
            if(matrix[rows][colms]==target){
                return true;
            }else if(target<matrix[rows][colms]){
                colms--;
            }else{
                rows++;
            }
        }
        return false;
    }
}