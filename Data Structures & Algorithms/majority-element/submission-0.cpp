class Solution {
public:
    int majorityElement(vector<int>& nums) {
        int n = nums.size();
        if(n == 0) return -1;
        if(n == 1) return nums[0];
        int val = INT_MIN;
        int cnt = 0;
        for(int i=0;i<n;i++){
            if(cnt == 0) {
                val = nums[i];
                cnt++;
            } else if(nums[i] == val) cnt++;
            else cnt--;
        }
        cnt = 0;
        for(int i=0;i<n;i++){
            if(nums[i] == val) cnt++;
        }
        if(cnt > n/2) return val;
        return -1;
    }
};