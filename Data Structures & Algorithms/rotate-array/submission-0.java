class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k %= n;
        int[] arr = new int[n];
        int x = 0;
        for(int i=n-k;i<n;i++){
            arr[x++] = nums[i];
        }
        for(int i=0;i<n-k;i++){
            arr[x++] = nums[i];
        }
        for(int i=0;i<n;i++){
            nums[i] = arr[i];
        }
    }
}