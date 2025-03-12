class Solution {
    public int wateringPlants(int[] plants, int capacity) {
        int t=capacity;
        int sum=0;
        for(int i=0;i<plants.length;i++)
        {
            if(plants[i]>t)
            {
                sum+=i*2;
                t=capacity;
            }
            t-=plants[i];
        }
        return sum+plants.length;
    }
}