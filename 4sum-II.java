public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i:nums1)
        {
            for(int j:nums2)
            {
                map.put(i+j,map.getOrDefault(i+j,0)+1);
            }
        }
        int res=0;
        for(int i:nums3)
        {
            for(int j:nums4)
            {
                if(map.containsKey(-(i+j)))
                    res+=map.get(-(i+j));
            }
        }
        return res;
    }
