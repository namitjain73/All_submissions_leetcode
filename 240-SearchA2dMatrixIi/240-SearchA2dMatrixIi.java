// Last updated: 8/28/2025, 2:50:46 AM
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        return search(matrix,target);
        
    }

    public static boolean search(int[][] arr,int t){
        int r = 0;
        int c  = arr[0].length - 1;
        while(r < arr.length && c >= 0){
            if(arr[r][c] == t){
                return true;
            }
            else if(arr[r][c] > t){
                c--;

            }
            else if(arr[r][c] < t){ 
                r++;
            }

        }
        return false;

    }
}