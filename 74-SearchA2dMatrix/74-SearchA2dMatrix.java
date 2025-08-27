// Last updated: 8/28/2025, 2:52:16 AM
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        return Search_traget(matrix,target);
        
    }


    public static boolean Search_traget(int[][] arr,int t){
        int n = arr.length;
		int m = arr[0].length;
		for(int i = 0 ; i < n ; i++) {
			for(int j = 0 ; j < m ; j++) {
				if(arr[i][j] == t){
                    return true;
                }
			}
		}
        return false;
    }
}