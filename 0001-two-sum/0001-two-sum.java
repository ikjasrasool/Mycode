class Solution {
    class Pair
    {
        int ind;
        int val;
        Pair(int ind,int val)
        {
            this.ind=ind;
            this.val=val;
        }
    }
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length-1;
        Pair[] arr=new Pair[n+1];
        for(int i=0;i<=n;i++)
        {
            arr[i]=new Pair(i,nums[i]);
        }
        Arrays.sort(arr,(a,b)->Integer.compare(a.val, b.val));
        int l=0;
        int r=n;
        while(l<=r)
        {
            int sum=arr[l].val+arr[r].val;
            if(sum==target)
            {
                return new int[]{arr[l].ind,arr[r].ind};
            }
            else if(target<sum)
            {
                r--;
            }
            else
            {
                l++;
            }
        }
        return new int[]{};
    }
}