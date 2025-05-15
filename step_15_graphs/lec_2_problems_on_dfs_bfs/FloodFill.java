package step_15_graphs.lec_2_problems_on_dfs_bfs;

public class FloodFill {

    private void helperDFS(int row, int col, int origColor, int[][] image, int color){
        if(row < 0 || col < 0 || row >= image.length || col >= image[0].length || image[row][col] != origColor){
            return;
        }

        image[row][col] = color;
        
        helperDFS(row - 1, col, origColor, image, color);
        helperDFS(row  + 1, col, origColor, image, color);
        helperDFS(row, col - 1, origColor, image, color);
        helperDFS(row, col + 1 , origColor, image, color);
    }


    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
       if(image[sr][sc] == color) return image;
       int origColor = image[sr][sc];
       helperDFS(sr, sc, origColor, image, color);
       return image;
    }
}