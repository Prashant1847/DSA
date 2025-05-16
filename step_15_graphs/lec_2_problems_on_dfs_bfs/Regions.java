package step_15_graphs.lec_2_problems_on_dfs_bfs;

class Region {

    private void surround(int i, int j, char[][] board, boolean vis[][]){
        
        if(board[i][j] == 'X') return;

        vis[i][j] = true;

        int drow[] = {-1, 0, 1, 0};
        int dcols[] = {0, 1, 0, -1};

        for(int d = 0; d<4; d++){
            int nrow = i + drow[d];
            int ncol = j + dcols[d];
            if(nrow < 0 || ncol < 0 || nrow >= board.length || ncol >= board[0].length) continue;
            if(!vis[nrow][ncol]) surround(nrow, ncol, board, vis);    
        }        
    }


    public void solve(char[][] board) {
        int rows = board.length;
        int cols = board[0].length;
        boolean vis[][] = new boolean[rows][cols];

        
        for(int i = 0; i<cols; i++){
            if(!vis[0][i]) surround(0, i, board, vis);
            if(!vis[rows-1][i]) surround(rows - 1, i, board, vis);
        }


        for(int i = 0; i<rows; i++){
            if(!vis[i][0]) surround(i, 0, board, vis);
            if(!vis[i][cols-1]) surround(i, cols-1, board, vis);
        }

        for(int i = 0; i<rows; i++){
            for(int j = 0; j<cols; j++){
                if(!vis[i][j] && board[i][j] == 'O') board[i][j] = 'X';
            }
        }
    }
}
