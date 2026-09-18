class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        if(n == 0) return -1;
        int x = Integer.MIN_VALUE;
        int cnt = 0;
        for(int i=0;i<n;i++) {
            if(cnt == 0) {
                x = nums[i];
                cnt++;
            } else if(x == nums[i]){
                cnt++;
            } else{
                cnt--;
            }
        }
        return x;
    }
}