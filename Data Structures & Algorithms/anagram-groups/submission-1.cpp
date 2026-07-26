class Solution {
public:
    string generate(string s){
        int arr[26] = {0};
        for(char ch : s){
            arr[ch - 'a']++;
        }
        string key = "";
        for(int i=0;i<26;i++){
            if(arr[i] > 0){
                key += string(arr[i], i+'a');
            }
        }
        return key;
    }
    vector<vector<string>> groupAnagrams(vector<string>& strs) {
        vector<vector<string>> ans;
        int n = strs.size();
        unordered_map<string, vector<string>> group;
        for(int i=0;i<n;i++){
            string s = strs[i];
            // sort(s.begin(), s.end());
            s = generate(strs[i]);
            group[s].push_back(strs[i]);
        }
        for(auto it : group){
            ans.push_back(it.second);
        }
        return ans;
    }
};
