class Solution {
    public boolean isPerfectSquare(int num) {
        long temp =num;
        while(temp*temp > num){
            temp = (temp + num/temp)/2;
        }
        boolean response = temp*temp == num ? true: false;
        return response;
    }
}