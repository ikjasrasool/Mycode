class Solution {
public:
    vector<int> nextGreaterElement(vector<int>& nums1, vector<int>& nums2) {
        stack<int> s;
        unordered_map<int,int> m;
        for(auto i:nums2)
        {
            while(!s.empty()&&i>s.top())
            {
                m[s.top()]=i;
                s.pop();
            }
            s.push(i);

        }
        vector<int>v;
        for(auto i:nums1)
        {
            if(m[i]!=0)
                v.push_back(m[i]);
            else
                v.push_back(-1);
        }
        return v;
    }
};