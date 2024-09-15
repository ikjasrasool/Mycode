class Solution {
    public int[] decode(int[] encoded, int first) {
        int n=encoded.length;
        int []a=new int[n+1];
        a[0]=first;
        for(int i=0;i<n;i++)
        {
            a[i+1]=encoded[i]^a[i];
        }
        return a;
    }
}