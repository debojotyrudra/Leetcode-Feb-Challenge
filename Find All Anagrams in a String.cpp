#include<bits/stdc++.h>
using namespace std;
vector<int> findAnagrams(string s, string p) {
        if(s.size() < p.size()) return {};
        vector<int>ans;
        vector<int>freq(26, 0),xc  mp(26,0);
        for(auto ch : p)
            freq[ch - 'a']++;
        
        int j = 0;
        for(int i = 0; i < s.size(); i++)
        {
            mp[s[i] - 'a']++;
            while(mp[s[i] - 'a'] > freq[s[i] - 'a'])
            {
                mp[s[j] - 'a']--;
                j++;
            }
            bool possible = true;
            for(int i = 0; i < 26; i++)
            {
                if(mp[i] != freq[i]) 
                {
                    possible = false;
                    break;
                }
            }
            if(possible)
                ans.push_back(j);
        }
        
        return ans;
    }
int main()
{
     string s,p;
     cin>>s>>p;
     vector<int> ans=findAnagrams(s,p);
     int i;
     for(i=0;i<ans.size()-1;i++)
        cout<<ans[i]<<",";
     cout<<ans[i];
     return 0;
}
