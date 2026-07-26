class Solution {
public:
    string longestCommonPrefix(vector<string>& strs) {
        int n = strs.size();
        // string s = strs[0];
        string ans = strs[0];
        if(n == 1) return ans;
        for(int i=1;i<n;i++) {
            int j = 0;
            for(j=0;j<min(ans.size(), strs[i].size());j++) {
                if(ans[j] != strs[i][j]) break;
            }
            ans = ans.substr(0, j);
        }
        return ans;
    }
};