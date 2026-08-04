class Solution {
 
    public boolean exist(char[][] board, String word) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                
                    if(backTrack(board, i, j, word, 0)) return true;
            }
        }

        return false;
    }



    public boolean backTrack(char[][] board, int row, int col, String word, int size){
        if(size == word.length()){
            return true;
        }

        if(row >= board.length || row < 0 || col >= board[0].length || col < 0 || board[row][col] != word.charAt(size) || board[row][col] == '#'){
            return false;
        }

        board[row][col] = '#';
        boolean res = backTrack(board, row -1, col, word, size + 1)||
                        backTrack(board, row +1, col, word, size + 1)||
                         backTrack(board, row , col-1, word, size + 1)||
                          backTrack(board, row, col+1, word, size + 1);

        board[row][col] = word.charAt(size);

        return res;

    }
}
