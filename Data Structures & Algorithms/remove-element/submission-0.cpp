class Solution {
public:
    int removeElement(vector<int>& nums, int val) {
        int n = nums.size(), i=0;
        for(int x=0;x<n;x++){
            if(nums[x] != val){
                nums[i++] = nums[x];
            }
        }
        return i;
    }
};