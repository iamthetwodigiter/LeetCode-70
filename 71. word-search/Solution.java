class Solution {
    private boolean dfs(char[][] board, String word, int r, int c, int index) {
        // Base Case: All characters found
        if(index == word.length()) return true;

        // Boundary and match checks
        if(r < 0 || r >= board.length || c < 0 || c >= board[0].length || board[r][c] != word.charAt(index)) return false;

        // 1. Mark current cell as visited
        char temp = board[r][c];
        board[r][c] = '#';

        // 2. Explore neighbors (Up, Down, Left, Right)
        boolean found = dfs(board, word, r+1, c, index+1) ||
                        dfs(board, word, r-1, c, index+1) ||
                        dfs(board, word, r, c+1, index+1) ||
                        dfs(board, word, r, c-1, index+1);

        // 3. Backtrack: Restore the cell for other paths
        board[r][c] = temp;

        return found;
    }

    public boolean exist(char[][] board, String word) {
        int rows = board.length;
        int cols = board[0].length;

        for(int r=0; r<rows; r++) {
            for(int c=0; c<cols; c++) {
                // Start DFS if the first letter matches
                if(dfs(board, word, r, c, 0)) return true;
            }
        }
        return false;
    }
}