class Solution {
public:
    void merge(vector<int>& nums, int i, int mid, int j) {
        vector<int> temp;
        int left = i, right = mid + 1;
        while(left <= mid && right <= j){
            if(nums[left] < nums[right]){
                temp.push_back(nums[left]);
                left++;
            } else{
                temp.push_back(nums[right]);
                right++;
            }
        }
        while(left <= mid){
            temp.push_back(nums[left]);
            left++;
        }
        while(right <= j){
            temp.push_back(nums[right]);
            right++;
        }
        for(int x=i;x<=j;x++){
            nums[x] = temp[x-i];
        }
    }
    void mergeSort(vector<int>& nums, int i, int j){
        if(i>=j) return;
        int mid = i + (j - i)/2;
        mergeSort(nums, i, mid);
        mergeSort(nums, mid+1, j);
        merge(nums, i, mid, j);
    }
    vector<int> sortArray(vector<int>& nums) {
        int i=0,j=nums.size()-1;
        mergeSort(nums, i, j);
        return nums;
    }
};