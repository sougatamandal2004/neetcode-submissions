class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int []left = new int[m];
        int []up = new int[n];
        Arrays.fill(up, 1);
        Arrays.fill(left, 1);
        for(int i=0;i<m;i++) {
            for(int j=0;j<n;j++) {
                if(matrix[i][j] == 0) {
                    left[i] = 0;
                    up[j] = 0;
                }
            }
        }
        for(int i=0;i<m;i++){
            if(left[i] == 0){
                Arrays.fill(matrix[i], 0);
            }
        }
        for(int j=0;j<n;j++){
            if(up[j] == 0){
                for(int i=0;i<m;i++){
                    matrix[i][j] = 0;
                }
            }
        }

    }
}
