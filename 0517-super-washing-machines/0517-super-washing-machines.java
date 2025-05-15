class Solution {
    public int findMinMoves(int[] machines) {
        int sum= 0;
        for(int i: machines)sum += i;
        if(sum % machines.length!=0)return -1;
        int avg = sum/machines.length;
        int c=0;
        int max = 0;
        for(int num: machines){
            c+=num-avg;
            max=Math.max(Math.max(max,Math.abs(c)),num-avg);
        }
        return max;
    }
}