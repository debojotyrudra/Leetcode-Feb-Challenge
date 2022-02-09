int findPairs(vector<int>& nums, int k) {
        int c=0;
        unordered_map<int,int> map;
        for(auto it:nums)
        {
            map[it]++;
        }
        for(auto it:map)
        {
            if(k==0 && it.second>1)
                c++;
            if(k>0 && map.count(it.first+k))
                c++;
        }
        return c;
    }
