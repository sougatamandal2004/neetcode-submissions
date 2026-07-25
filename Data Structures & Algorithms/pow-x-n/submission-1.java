class Solution {
    public double myPow(double x, int n) {
        // double d = Math.pow(x,n);
        // return d;

        if(x==0) return 0;
        if(n==0) return 1;
        double res = 1;
        for(int i=1;i<=Math.abs(n);i++){
            res *= x;
        }
        if(n < 0) return 1/res;
        else return res;
    }
}
