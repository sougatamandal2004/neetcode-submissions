class Solution {
    public int removeElement(int[] nums, int val) {
        int i = 0, n = nums.length;
        int p = 0;
        while(i<n){
            if(nums[i] != val) {
                nums[p++] = nums[i];
            }
            i++;
        }
        return p;
    }
}