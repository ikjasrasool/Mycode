class Solution {
    public int maxChunksToSorted(int[] arr) {
        int n=arr.length;
        //initailize the max and chunk
        int max=Integer.MIN_VALUE;
        int chunk=0;
        for(int i=0;i<n;i++)
        {
            //check max value
            max=Math.max(max,arr[i]);
            //max==i means we separate chunk
            //1 0 2 3 4 5 
            //0 1 2 3 4 5
            if(max==i)
            {
                chunk++;
            }
        }
        return chunk;
    }
}