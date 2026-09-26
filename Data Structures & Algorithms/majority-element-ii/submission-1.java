class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        int num1 = Integer.MIN_VALUE, num2 = Integer.MIN_VALUE;
        int cnt1 = 0, cnt2 = 0;
        for(int i=0;i<n;i++) {
            if(cnt1 == 0 && nums[i] != num2){
                num1 = nums[i];
                cnt1++;
            } else if(cnt2 == 0 && nums[i] != num1) {
                num2 = nums[i];
                cnt2++;
            } else if(nums[i] == num1) cnt1++;
            else if(nums[i] == num2) cnt2++;
            else{
                cnt1--;
                cnt2--;
            }
        }
        cnt1 = 0;
        cnt2 = 0;
        for(int i=0;i<n;i++){
            if(nums[i] == num1) cnt1++;
            else if(nums[i] == num2) cnt2++;
        }
        List<Integer> list = new ArrayList<>();
        if(cnt1 > n/3) list.add(num1);
        if(cnt2 > n/3) list.add(num2);
        return list;
    }
}