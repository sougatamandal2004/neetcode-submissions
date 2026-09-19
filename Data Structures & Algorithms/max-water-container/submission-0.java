class Solution {
    public int maxArea(int[] heights) {
        int n = heights.length;
        int i=0, j = n-1;
        int maxWater = 0;
        while(i < j){
            int width = j - i;
            int height = Math.min(heights[i], heights[j]);
            maxWater = Math.max(maxWater, width * height);
            if(height == heights[i]) i++;
            else j--;
        }
        return maxWater;
    }
}
