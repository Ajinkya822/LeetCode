class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> set=new HashSet<>();
        
        for(int r=0;r<board.length;r++){
            for(int c=0;c<board[0].length;c++){
                if(board[r][c]=='.'){
                    continue;
                }
                else if((set.add("row"+r+board[r][c])) && (set.add("col"+c+board[r][c])) && (set.add("cell"+(r/3)+(c/3)+board[r][c]))){
                    
                }
                else{
                    return false;
                }
            }
        }
        return true;
    }
}