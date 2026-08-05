class Solution {

    char[][] c;
    List<List<String>> ans;
    boolean[] postDig;
    boolean[] negDig;
    boolean[] col;
    public List<List<String>> solveNQueens(int n) {
        ans = new ArrayList<>();
        c = new char[n][n];
        postDig = new boolean[2*n];
        negDig = new boolean[2*n];
        col = new boolean[n];

           for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                c[i][j] = '.';
            }
        }
        backTrack(0, n);
        return ans;
    }


    public void backTrack(int r, int n){
        if(r == n){
            List<String> copy = new ArrayList<>();
            for(char[] row : c){
                copy.add(new String(row));
            }

            ans.add(copy);
            return;
        }


        for(int i = 0; i < n; i++){
            if(col[i] || postDig[r+i] || negDig[r - i + n]){
                continue;
            }

            col[i] = true;
            postDig[r+i] = true;
            negDig[r-i+n] = true;
            c[r][i] = 'Q';

            backTrack(r + 1, n);

            col[i] = false;
            postDig[r+i] = false;
            negDig[r-i+n] = false;
            c[r][i] = '.';
        }
    }
}
