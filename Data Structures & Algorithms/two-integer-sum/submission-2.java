class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Brute Force => by using nested loop
        // TC -> O(N^2), SC -> O(1)

        // Better -> By storing all the values in a map, and by traversing the element, check other is present or not
        // TC -> O(N), SC -> O(N);
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<n;i++) {
            int req = target - nums[i];
            if(map.containsKey(req)) {
                return new int[]{map.get(req), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{-1, -1};

        // Optimal -> Sort the array, take two pointer one from starting and one from ending and check if the sum matches or not
        // TC -> O(NlogN), SC -> O(1)
    }
}
