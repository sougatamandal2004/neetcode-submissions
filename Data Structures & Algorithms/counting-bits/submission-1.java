class Solution {
    public int[] countBits(int n) {
        if(n == 0) return new int[]{0};
        int[] arr = new int[n+1];
        arr[0] = 0;
        arr[1] = 1;
        if(n == 1) return arr;
        for(int i=2;i<=n;i++){
            if(i%2 == 0) arr[i] = arr[i/2];
            else arr[i] = arr[i/2] + 1;
        }
        return arr;
    }
}
