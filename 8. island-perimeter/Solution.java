class Solution {
    private int dfs(int[][] grid, int m, int n, int i, int j) {
        if(i < 0 || i >= m || j < 0 || j >= n || grid[i][j] == 0) {
            return 1;
        }

        if(grid[i][j] == -1) return 0;

        grid[i][j] = -1;

        int count = 0;
        count += dfs(grid, m, n, i+1, j);
        count += dfs(grid, m, n, i-1, j);
        count += dfs(grid, m, n, i, j+1);
        count += dfs(grid, m, n, i, j-1);
        
        return count;
    }

    public int islandPerimeter(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        for(int i=0;  i<m; i++) {
            for(int j=0; j<n; j++) {
                if(grid[i][j] == 1) {
                    return dfs(grid, m, n, i, j);
                }
            }
        }
        return 0;
    }
}