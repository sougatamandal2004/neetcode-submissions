class Solution {
public:
    vector<vector<string>> groupAnagrams(vector<string>& strs) {
        vector<vector<string>> ans;
        int n = strs.size();
        unordered_map<string, vector<string>> group;
        for(int i=0;i<n;i++){
            string s = strs[i];
            sort(s.begin(), s.end());
            group[s].push_back(strs[i]);
        }
        for(auto it : group){
            ans.push_back(it.second);
        }
        return ans;
    }
};
