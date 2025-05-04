package step_7_recursion.lec_3_trying_all_combos;

public class _2_WordSearch {

    private static boolean findWord(char[][] board, String word, int rowIndex, int colIndex, int charIndex) {
        if (charIndex == word.length()) return true;

        char ch = word.charAt(charIndex);
        board[rowIndex][colIndex] = '#';
        boolean result = false;

        if (rowIndex - 1 >= 0 && board[rowIndex - 1][colIndex] == ch) {
            result = findWord(board, word, rowIndex - 1, colIndex, charIndex + 1);
        }

        if (rowIndex + 1 < board.length && board[rowIndex + 1][colIndex] == ch && !result) {
            result = findWord(board, word, rowIndex + 1, colIndex, charIndex + 1);
        }

        if (colIndex - 1 >= 0 && board[rowIndex][colIndex - 1] == ch && !result) {
            result = findWord(board, word, rowIndex, colIndex - 1, charIndex + 1);
        }

        if (colIndex + 1 < board[0].length && board[rowIndex][colIndex + 1] == ch && !result) {
            result = findWord(board, word, rowIndex, colIndex + 1, charIndex + 1);
        }

        board[rowIndex][colIndex] = word.charAt(charIndex - 1);
        return result;
    }

    public static boolean exist(char[][] board, String word) {
        int rows = board.length;
        int cols = board[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (board[i][j] == word.charAt(0)) {
                    if (findWord(board, word, i, j, 1)) return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        char[][] board = {
            {'A', 'B', 'C', 'E'},
            {'S', 'F', 'C', 'S'},
            {'A', 'D', 'E', 'E'}
        };

        String word = "SEE";
        boolean found = exist(board, word);
        System.out.println("Word \"" + word + "\" exists in board: " + found);
    }
}
