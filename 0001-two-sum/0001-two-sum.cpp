class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        int n=nums.size();
        unordered_map<int,int>m;
        vector<int> res;
        for(int i=0;i<n;i++)
        {
            if(m.count(target-nums[i])==1)
            {
                res.push_back(i);
                res.push_back(m[target-nums[i]]);
                return res;

            }
            m[nums[i]]=i;
        }
        return res;
    }
};