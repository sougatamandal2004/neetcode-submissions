class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int leftMaxArr[] = new int[n];
        int rightMaxArr[] = new int[n];
        int trappedWater = 0;
        // calculating leftMaxArr
        leftMaxArr[0] = height[0];
        for(int i=1;i<n;i++){
            leftMaxArr[i] = Math.max(height[i], leftMaxArr[i-1]);
        }
        // calculating rightMaxArr
        rightMaxArr[n-1] = height[n-1];
        for(int i=n-2;i>=0;i--){
            rightMaxArr[i] = Math.max(height[i], rightMaxArr[i+1]);
        }
        // calculating trapped water
        for(int i=0;i<n;i++){
            int waterLevel = Math.min(leftMaxArr[i], rightMaxArr[i]);
            trappedWater += (waterLevel - height[i]);
        }
        return trappedWater;
    }
}
