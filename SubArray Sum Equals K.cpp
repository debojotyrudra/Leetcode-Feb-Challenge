int subarraySum(vector<int>& nums, int k) {
        int sum=0,i,n=nums.size(),c=0;
        unordered_map<int,int> map;
        map[0]=1;
        for(i=0;i<n;i++)
        {
            sum+=nums[i];
            if(map.find(sum-k)!=map.end())
                c+=map[sum-k];
            map[sum]++;
        }
        return c;
    }
