class Solution {
    public double findMedianSortedArrays(int[] arr1, int[] arr2) {
        int n=arr1.length;
        int m=arr2.length;
        int[] res = new int[n+m];
        int i=0,j=0,k=0;
        while(i<n && j<m){
            if(arr1[i]<arr2[j]){
                res[k]=arr1[i];
                i++;k++;
            }
            else{
                res[k]=arr2[j];
                j++;k++;
            }
        }
        while(i<n){
            res[k]=arr1[i];
            i++;k++;
        }
        while(j<m){
            res[k]=arr2[j];
            j++;k++;
        }
        if((m+n)%2 == 0){
            return (float)(res[(m+n)/2]+res[((m+n)/2)-1])/2;
        }
        else{
            return res[(m+n)/2];
        }  
    }
}