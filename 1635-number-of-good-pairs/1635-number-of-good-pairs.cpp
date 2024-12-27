class Solution {
public:
    int numIdenticalPairs(vector<int>& nums) {
        int c=0;
        unordered_map<int,int>m;
        for(auto ele:nums)
        {
            c=c+m[ele];
            m[ele]=m[ele]+1;
        }
        return c;
    }
};