class Solution {
    public boolean hasDuplicate(int[] nums) {
        // Brute Force
        // TC -> O(n^2), SC -> O(1)
        // int n = nums.length;
        // for(int i=0;i<n-1;i++){
        //     for(int j=i+1;j<n;j++) {
        //         if(nums[i] == nums[j]) return true;
        //     }
        // }
        // return false;

        // Optimal
        // TC -> O(nlogn), SC -> O(1)
        int n = nums.length;
        Arrays.sort(nums);
        for(int i=0;i<n-1;i++){
            if(nums[i] == nums[i+1]) return true;
        }
        return false;
    }
}