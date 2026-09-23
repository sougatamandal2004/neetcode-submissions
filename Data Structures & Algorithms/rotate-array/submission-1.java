class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = ((k%n) + n)%n;
        int[] rotated = Arrays.copyOfRange(nums, n-k, n);
        System.arraycopy(nums, 0, nums, k, n - k);
        System.arraycopy(rotated, 0, nums, 0, rotated.length);
    }
}