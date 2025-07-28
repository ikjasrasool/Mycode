class Solution {
    class Pair
    {
        int idx;
        int val;
        Pair(int idx,int val)
        {
            this.val=val;
            this.idx=idx;
        }
    }
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        Pair[] arr=new Pair[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=new Pair(i,nums[i]);
        }
        Arrays.sort(arr,(a,b)->Integer.compare(a.val,b.val));
         int l=0;
        int r=n-1;
        while(l<=r)
        {
            int sum=arr[l].val+arr[r].val;
            if(sum==target)
            {
                return new int[]{arr[l].idx,arr[r].idx};
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
