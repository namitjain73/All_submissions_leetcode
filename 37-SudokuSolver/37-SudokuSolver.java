// Last updated: 8/28/2025, 2:52:43 AM
class Solution {
    public void solveSudoku(char[][] board) {
		int[][] grid = new int[board.length][board[0].length];
		for(int i = 0 ; i < board.length ; i++){
		    for(int j = 0 ; j < board[0].length ; j++){
		        if(board[i][j] == ('.')){
		            grid[i][j] = 0;
		        }
		        else{
		            grid[i][j] = board[i][j] - '0' ;
		        }
		    }
		}
		Print(grid, 0, 0);
		for(int i = 0 ; i < board.length ; i++){
		    for(int j = 0 ; j < board[0].length ; j++){
		        board[i][j] = (char)(grid[i][j] + '0');
		    }
		}
		// Display(board);

	}
	

	public static boolean Print(int[][] grid , int row , int col) {
		
		if(col == 9) {
			row++;
			col = 0;
		}
		
		if(row == 9) {
			return true;
		}
		if(grid[row][col]!=0) {
			return Print(grid , row , col  + 1);
		}
		
		else {
			for(int val = 1 ; val <= 9 ; val++) {
				if(ispossible(grid,row,col,val)) {
					grid[row][col] = val;
					boolean ans = Print(grid,row,col+1);
					if(ans) {
						return true;
					}
					grid[row][col] = 0;
				}
			}
		}
		return false;
	}
	
	public static boolean ispossible(int[][] grid , int row , int col, int val){
	    for(int i = 0; i < 9 ; i++){
	        if(grid[row][i] == val){
	            return false;
	        }
	    }
	    for(int i = 0 ; i < 9 ; i++){
	        if(grid[i][col] == val){
	            return false;
	        }
	    }
	    
	    int r = row - row % 3;
	    int c = col - col % 3;
	    for(int i = r ; i < r+3 ; i++){
	        for(int j = c ; j < c+3 ; j++){
	            if(grid[i][j] == val){
	                return false;
	            }
	        }
	    }
	    return true;
	}
}