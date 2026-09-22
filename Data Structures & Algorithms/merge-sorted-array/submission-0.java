class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] ans = new int[m+n];
        int x = 0;
        int i=0, j = 0;
        while(i < m && j < n) {
            if(nums1[i] < nums2[j]){
                ans[x++] = nums1[i];
                i++;
            } else{
                ans[x++] = nums2[j];
                j++;
            }
        }
        while(i < m){
            ans[x++] = nums1[i++];
        }
        while(j < n) {
            ans[x++] = nums2[j++];
        }
        for(int t=0;t<m+n;t++) {
            nums1[t] = ans[t];
        }
    }
}