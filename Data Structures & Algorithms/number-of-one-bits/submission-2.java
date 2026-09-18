class Solution {
    public int hammingWeight(int n) {
        int cnt = 0;
        int x = n;
        while(x != 0){
            if((x&1) == 1) cnt++;
            x >>>= 1;
        }
        return cnt;
    }
}
