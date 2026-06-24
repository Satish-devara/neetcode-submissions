class Solution {

  public boolean checkRow(char[][] board, int r, int c, char val){
        for(int i = 0; i < 9; i++){
            if(i == c) continue;
            if(board[r][i] == val){
                return false;
            }
        }

        return true;
  } 

  public boolean checkCol(char[][] board, int r, int c, char val){
        for(int i = 0; i < 9; i++){
             if(i == r) continue;
            if(board[i][c] == val){
                
                return false;
            }
        }

        return true;
  } 


  public boolean checkSquare(char[][] board, int r, int c, char val){

    int newRow = (r/3)*3;
    int newCol = (c/3)*3;


        for(int i = 0; i < 3; i++){
            for(int j = 0;  j < 3; j++){
                int row = newRow + i;
                int col = newCol + j;

                if(row == r && col == c){
                    continue;
                }

                if(board[row][col] == val){
                    return false;
                }
            }

            
        }
        return true;
  } 


    public boolean isValidSudoku(char[][] board) {
        

        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                if(board[i][j] == '.'){
                    continue;
                }else{
                    if(!checkRow(board, i, j, board[i][j]) || !checkCol(board, i, j, board[i][j])|| !checkSquare(board, i, j, board[i][j])) return false;
                }
            }
        }

        return true;
    }
}
