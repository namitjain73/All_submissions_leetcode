// Last updated: 8/28/2025, 2:48:51 AM
class Solution {
    public int[][] transpose(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] ans = new int[n][m];
        for(int i = 0 ; i  < m ; i++){
            for(int j = 0 ; j < n ; j++){
                ans[j][i] = matrix[i][j];
            }
        }
        return ans;

        
    }
}