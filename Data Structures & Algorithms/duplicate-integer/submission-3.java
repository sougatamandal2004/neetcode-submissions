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
// ------------------------------------------------------------
        // Optimal-1
        // TC -> O(nlogn), SC -> O(1)
        // int n = nums.length;
        // Arrays.sort(nums);
        // for(int i=0;i<n-1;i++){
        //     if(nums[i] == nums[i+1]) return true;
        // }
        // return false;
// ------------------------------------------------------------
        // Optimal-2
        // TC -> O(n), SC -> O(n)
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for(Map.Entry<Integer, Integer> entry : map.entrySet() ) {
            int value = entry.getValue();
            if(value > 1) return true;
        }
        return false;
    }
}