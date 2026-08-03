class Solution {
public:
    int mySqrt(int x) {
        int a = 0, b = x;
        int ans = 0;
        while(a <= b){
            int mid = a + (b-a)/2;
            long long sq = 1LL * mid * mid;
            if(sq == x) return mid;
            else if(sq < x) {
                ans = mid;
                a = mid+1;
            } else{
                b = mid - 1;
            }
        }
        return ans;
    }
};