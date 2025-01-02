class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max=candies[0];
        for(int i=1;i<candies.length;i++)
        {
            if(candies[i]>max)
            {
                max=candies[i];
            }
        }
        List<Boolean>a=new ArrayList<Boolean>(candies.length);
        for(int i=0;i<candies.length;i++)
        {
            if(candies[i]+extraCandies>=max)
            {
                a.add(true);
            }
            else
            {
                a.add(false);
            }
        }
        return a;
    }
}