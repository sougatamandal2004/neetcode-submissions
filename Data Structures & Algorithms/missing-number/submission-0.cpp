class Solution {
public:
    int missingNumber(vector<int>& nums) {
        int n = nums.size();
        int actualSum = n * (n+1)/2;
        int currSum = 0;
        for(int num : nums) {
            currSum += num;
        }
        return (actualSum - currSum);
    }
};
